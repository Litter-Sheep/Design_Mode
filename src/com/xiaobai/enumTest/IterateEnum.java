package com.xiaobai.enumTest;

/**
 * @paogram: com.xiaobai.enumTest
 * @description: a iterate enum
 * @author: CodeXiaoBai
 * @createDate: 2022-07-25
 */

enum Color {
    RED, BULE, GREEN
}

public class IterateEnum {
    public static void main(String[] args) {
        for (Color myColor : Color.values()) {
            System.out.println(myColor);
        }
    }
}
