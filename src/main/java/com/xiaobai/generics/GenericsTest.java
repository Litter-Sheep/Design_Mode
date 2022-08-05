package com.xiaobai.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @paogram: com.xiaobai.generics
 * @description: the Type Wildcard main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-29
 */

public class GenericsTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        List<Number> numbers = new ArrayList<Number>();
        List<String> strings = new ArrayList<String>();

        integers.add(10);
        numbers.add(20);
        strings.add("Hello world!");

        getData(integers);
        getData(numbers);
        getData(strings);

        System.out.println("-----");

        getUperNumber(integers);
        getUperNumber(numbers);
//        getUperNumber(strings);
    }

    public static void getData(List<?> data) {
        System.out.println("Data: " + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("Data: " + data.get(0));
    }
}
