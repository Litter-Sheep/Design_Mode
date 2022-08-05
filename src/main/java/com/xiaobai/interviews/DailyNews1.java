package com.xiaobai.interviews;

/**
 * @paogram: com.xiaobai.interviews
 * @description: 字节跳动
 * @author: CodeXiaoBai
 * @createDate: 2022-08-05
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 *有 n 个字符串，每个字符串都是由 A-J 的大写字符构成。现在你将每个字符映射为一个 0-9 的数字，不同字符映射为不同的数字。这样每个字符串就可以看
 * 做一个整数，唯一的要求是这些整数必须是正整数且它们的字符串不能有前导零。现在问你怎样映射字符才能使得这些字符串表示的整数之和最大？
 */

public class DailyNews1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next();
            }
        }
    }

    public static long maxSum(int n, String string) {
        long sum = 0;       // 返回最大的和
        HashMap<Character, Long> hashMap = new HashMap<Character, Long>();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < n; i++) {
            setWeight(string[i], hashMap, arrayList);
        }

    }

    // 设置每个字符的权重，并保存首字符
    public static void setWeight(String string, HashMap<Character, Long> hashMap, ArrayList<Character> arrayList) {
        char[] chars = string.toCharArray();
        long init = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            // 检查hashMap中，key为char[i]是否存在
            if (hashMap.containsKey(chars[i])) {

            }
        }

    }
}
