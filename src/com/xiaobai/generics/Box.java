package com.xiaobai.generics;

/**
 * @paogram: com.xiaobai.generics
 * @description: a generics
 * @author: CodeXiaoBai
 * @createDate: 2022-07-29
 */

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World!") );

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}
