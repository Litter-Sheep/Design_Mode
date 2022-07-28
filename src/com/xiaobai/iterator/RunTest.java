package com.xiaobai.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @paogram: com.xiaobai.iterator
 * @description: the iterator main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-28
 */

public class RunTest {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<String> arrayList = new ArrayList<String>();
        // 向ArrayList内插入元素
        arrayList.add("Hello");
        arrayList.add("World!");

        // 获取迭代器
        Iterator<String> iterator = arrayList.iterator();
        // 输出集合中的第一个元素
        System.out.println(iterator.next());
        System.out.println("----");
        // 迭代获取集合中的元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);

    }
}
