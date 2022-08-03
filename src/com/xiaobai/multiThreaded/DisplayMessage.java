package com.xiaobai.multiThreaded;

/**
 * @paogram: com.xiaobai.multiThreaded
 * @description: 通过实现 Runnable 接口创建线程
 * @author: CodeXiaoBai
 * @createDate: 2022-08-03
 */

public class DisplayMessage implements Runnable{
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
