package com.xiaobai.collective_framework;

import java.util.*;

/**
 * @paogram: com.xiaobai.collective_framework
 * @description: travel List
 * @author: CodeXiaoBai
 * @createDate: 2022-07-27
 */

public class Test {
    public static void main(String[] args) {

        // 第一种遍历方法使用For-Each进行遍历List
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("你好");
        for (String str : list) {
            System.out.println(str);
        }

        // 第二种遍历方法：将链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String str : strArray) {
            System.out.println(str);
        }

        // 第三种方法：使用迭代器进行相关遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
