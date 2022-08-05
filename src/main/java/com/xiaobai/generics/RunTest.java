package com.xiaobai.generics;

/**
 * @paogram: com.xiaobai.generics
 * @description: the generics main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-28
 */

public class RunTest {
    // 泛型方法
    public static <E> void printArray(E[] inputArray) {
        // for-each 输出数组内元素
        for (E array : inputArray) {
            System.out.printf("%s ", array);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建Integer，Double和Character类型数组
        Integer[] integers = {1, 2, 3};
        Double[] doubles = {1.0, 2.0, 3.0};
        Character[] characters = {'A', 'B', 'C'};

        // 调用printArray泛型方法分别打印它们的值
        System.out.println("Integer：");
        printArray(integers);

        System.out.println("Double:");
        printArray(doubles);

        System.out.println("Character");
        printArray(characters);


    }
}
