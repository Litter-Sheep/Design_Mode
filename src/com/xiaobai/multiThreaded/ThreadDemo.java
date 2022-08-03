package com.xiaobai.multiThreaded;

/**
 * @paogram: com.xiaobai.multiThreaded
 * @description: extend the Thread class
 * @author: CodeXiaoBai
 * @createDate: 2022-08-03
 */

public class ThreadDemo extends Thread{
    private Thread thread;
    private String threadName;

    ThreadDemo (String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                // 让线程睡一会儿
                Thread.sleep(50);
            }
        }catch (InterruptedException interruptedException) {
            System.out.println("Thread " + threadName + " Interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
