package com.xiaobai.multiThreaded;

/**
 * @paogram: com.xiaobai.multiThreaded
 * @description: 通过继承 Thread 类创建线程
 * @author: CodeXiaoBai
 * @createDate: 2022-08-03
 */

public class GuessANumber extends Thread{
    private int number;

    public GuessANumber (int number) {
        this.number = number;
    }

    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guess" + guess);
            counter++;
        }while (guess != number);
        System.out.println("** Courrect!" + this.getName() + "in" + counter + "guesses. **");
    }

}
