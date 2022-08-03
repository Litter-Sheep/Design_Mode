package com.xiaobai.multiThreaded;

/**
 * @paogram: com.xiaobai.multiThreaded
 * @description: the thread test main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-08-02
 */

public class ThreadTest {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2");
        runnableDemo2.start();

        ThreadDemo threadDemo1 = new ThreadDemo("Thread-3");
        threadDemo1.start();

        ThreadDemo threadDemo2 = new ThreadDemo("Thread-4");
        threadDemo2.start();
    }
}
