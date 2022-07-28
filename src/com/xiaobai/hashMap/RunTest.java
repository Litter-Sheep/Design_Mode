package com.xiaobai.hashMap;

import java.util.HashMap;

/**
 * @paogram: com.xiaobai.hashMap
 * @description: a HashMap main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-28
 */

public class RunTest {
    public static void main(String[] args) {
        // 创建HashMap对象
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // 添加键值对
        hashMap.put(2, "World");
        hashMap.put(3, "你好");
        hashMap.put(1, "Hello");
        hashMap.put(4, "世界");
        System.out.println(hashMap);
        // 访问元素
        System.out.println(hashMap.get(1));

        // 创建HashMap对象
        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        // 添加键值对
        stringHashMap.put("two", "World");
        stringHashMap.put("three", "你好");
        stringHashMap.put("one", "Hello");
        stringHashMap.put("four", "世界");
        System.out.println(stringHashMap);
        // 访问元素
        System.out.println(stringHashMap.get("one"));
        // 删除元素
        System.out.println(stringHashMap.remove("four"));
        System.out.println(stringHashMap);
        // 删除所有键值对
//        stringHashMap.clear();
        System.out.println(stringHashMap);
        // 迭代输入Key和Vaule
        for (String i : stringHashMap.keySet()) {
            System.out.println("Key为：" + i + ", vaule为：" + stringHashMap.get(i));
        }
        // 只返回vaule
        for (String v : stringHashMap.values()) {
            System.out.print(v + ",");
        }


    }
}
