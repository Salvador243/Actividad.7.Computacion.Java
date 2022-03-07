package com.company;

public class Fibonacci {

    public void fibo(int serie){
        System.out.println("Sucesion de Fibonacci");
        for (int i = 0; i < serie; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
