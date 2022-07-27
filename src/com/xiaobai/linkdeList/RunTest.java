package com.xiaobai.linkdeList;

import java.util.LinkedList;

/**
 * @paogram: com.xiaobai.linkdeList
 * @description: a linkedList main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-27
 */

public class RunTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("World!");
        linkedList.add("你好");
        System.out.println(linkedList);

        // 使用addFirst函数在头部插入元素
        linkedList.addFirst("Hello");
        System.out.println(linkedList);

        // 使用addLast函数在尾部插入元素
        linkedList.addLast("世界！");
        System.out.println(linkedList);

        // 使用remove()函数删除指定元素
        linkedList.remove("Hello");
        System.out.println(linkedList);

        // remove()函数删除成功返回true，失败返回false
        System.out.println(linkedList.remove("Hello"));
        System.out.println(linkedList);

        // 使用removeFirst函数移除头部元素
        linkedList.removeFirst();
        System.out.println(linkedList);

        // 使用removeLast函数移除尾部元素
        linkedList.removeLast();
        System.out.println(linkedList);

        // 使用getFirst函数获取头部元素
        System.out.println(linkedList.getFirst());

        // 使用getLast函数获取尾部元素
        System.out.println(linkedList.getLast());

        // 使用for迭代元素
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // 使用for迭代元素，并组成一句话
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        // 使用for-each迭代元素
        for (String str : linkedList) {
            System.out.println(str);
        }

        // 使用contains函数判断元素是否存在于集合中
        System.out.println(linkedList.contains("Hello"));
    }
}
