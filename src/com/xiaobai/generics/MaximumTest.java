package com.xiaobai.generics;

/**
 * @paogram: com.xiaobai.generics
 * @description: a Maximum class
 * @author: CodeXiaoBai
 * @createDate: 2022-07-28
 */

public class MaximumTest {
    // 比较三个数的值，并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        System.out.println(y.compareTo(max));
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        // Integer类型
        System.out.printf("%d,%d,%d中，最大的是%d\n", 3, 4, 5, maximum(3, 4, 5));

        // Double类型
        System.out.printf("%.1f,%.1f,%.1f中，最大的是%.1f\n", 3.0, 4.0, 5.0, maximum(3.0, 4.0, 5.0));

        // Character类型
        System.out.printf("%s,%s,%s中，最大的是%s\n", "Hello", "World", "!", maximum("Hello", "World", "!"));
    }
}
