package com.xiaobai.hashSet;

import java.util.HashSet;

/**
 * @paogram: com.xiaobai.hashset
 * @description: a HashSet main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-27
 */

public class RunTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("World!");
        hashSet.add("你好");
        hashSet.add("World!");
        System.out.println(hashSet);

        // 判断元素是否存在
        System.out.println(hashSet.contains("World!"));


    }
}
