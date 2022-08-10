package com.xiaobai;

import java.util.*;

/**
 * @paogram: com.xiaobai
 * @description:
 * @author: CodeXiaoBai
 * @createDate: 2022-08-07
 */

public class Test {
    public static void main(String[] args) {
        // toCharArray方法的用法和返回值
//        String string = new String("hello world!");
//        char[] chars = string.toCharArray();
//        System.out.println(chars[0]);

        // containsKey方法的使用和效果
//        HashMap<Integer, String> sites = new HashMap<Integer, String>();
//        // 往HashMap添加一些元素
//        sites.put(1, "hello");
//        sites.put(2, " ");
//        sites.put(3, "World");
//        // 检查key为1是否存在
//        if (sites.containsKey(1)) {
//            System.out.println("改key已存在");
//            System.out.println(sites.containsKey(4));
//        }

        // Map.entrySet方法的使用和效果
//        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(sites.entrySet());
//        System.out.println(sites.entrySet());

        // Collection.sort方法的使用和效果
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add(" ");
        list.add("World");
        list.add("!");
        // 默认升序
        Collections.sort(list);
        System.out.println(list);
        // 降序
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
