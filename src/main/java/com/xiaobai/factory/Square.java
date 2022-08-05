package com.xiaobai.factory;

/**
 * @paogram: com.xiaobai.factory
 * @description: a implements Shape interface class
 * @author: CodeXiaoBai
 * @createDate: 2022-07-24
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
