package com.xiaobai.serializationAndDeserialization;

import org.omg.CORBA.portable.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @paogram: com.xiaobai.serializationAndDeserialization
 * @description: the Serializable main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-29
 */

public class SerializableTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Jack";
        employee.address = "广东省";
        employee.number = 11112222;
        employee.SSN = 888;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/serializable.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in /tmp/serializable.ser");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
