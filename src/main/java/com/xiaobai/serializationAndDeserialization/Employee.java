package com.xiaobai.serializationAndDeserialization;

import java.io.Serializable;

/**
 * @paogram: com.xiaobai.serializationAndDeserialization
 * @description: realization the serializable interface class
 * @author: CodeXiaoBai
 * @createDate: 2022-07-29
 */

public class Employee implements Serializable {
    public String name;
    public String address;
    public int number;
    public transient int SSN;   // transient关键字表示该属性不需要序列化

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address + " " + SSN);
    }
}
