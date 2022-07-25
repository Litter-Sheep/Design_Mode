package com.xiaobai.encapsulation;

/**
 * @paogram: com.xiaobai.encapsulation
 * @description: a run EncapTest main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-25
 */

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encapTest = new EncapTest();
        encapTest.setName("James");
        encapTest.setIdNum("1234");
        encapTest.setAge(20);

        System.out.println(encapTest.getName() + "\n" + encapTest.getAge());
    }
}
