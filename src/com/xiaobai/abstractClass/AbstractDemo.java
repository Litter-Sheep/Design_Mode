package com.xiaobai.abstractClass;

/**
 * @paogram: com.xiaobai.abstractClass
 * @description: abstract class main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-07-24
 */

public class AbstractDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee employee = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();

        System.out.println("\n Clall mailCheck using Employee reference--");
        employee.mailCheck();
    }
}
