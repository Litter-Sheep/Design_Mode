package com.xiaobai.multiThreaded;

/**
 * @paogram: com.xiaobai.multiThreaded
 * @description: Creating threads with Runnable
 * @author: CodeXiaoBai
 * @createDate: 2022-08-02
 */

public class RunnableDemo implements Runnable{
    private Thread thread;
    private String threadName;

    RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException interruptedException) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thead " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Thread " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
