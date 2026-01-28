package com.kovanlabs.intern.java.basics;

public class switchStatement {
    public static void main(String[] args) {

        //switch statement
        char op = '+';
        int a = 10, b = 5;

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Invalid operator");
        }

        //continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }
        //continue used in nested loop
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2)
                    continue outer;
                System.out.println(i + " " + j);
            }
        }


    }
}
