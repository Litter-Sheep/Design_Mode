package com.xiaobai.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @paogram: com.xiaobai.serializationAndDeserialization
 * @description: Deserialization /tmp/serializable.ser
 * @author: CodeXiaoBai
 * @createDate: 2022-07-29
 */

public class DeserializableTest {
    public static void main(String[] args) {
        Employee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("/tmp/serializable.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
            return;
        }catch (ClassNotFoundException c) {
            System.out.println("class employee is not found!");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialization employee...");
        System.out.println("Name:" + employee.name);
        System.out.println("Address:" + employee.address);
        System.out.println("Number:" + employee.number);
        System.out.println("SSM:" + employee.SSN);
    }
}
