package com.xiaobai.interfaceTest;

/**
 * @paogram: com.xiaobai.interfaceTest
 * @description: a implements Animal interface class
 * @author: CodeXiaoBai
 * @createDate: 2022-07-25
 */

public class MammalInt implements Animal {
    public static void main(String[] args) {
       MammalInt mammalInt = new MammalInt();
       mammalInt.eat();
       mammalInt.travel();
    }

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }
}
