package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Primos p = new Primos();
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos numeros primos quiere saber?");
        int t1 = s.nextInt();
        ArrayList<Integer> lista = (ArrayList<Integer>) p.calcularPrimos(t1);
        System.out.println("Numeros primos:");

        for (int i = 0; i < lista.size(); i++) {
            if(i == (lista.size()-1)){
                System.out.println(lista.get(i));
            }else {
                System.out.print(lista.get(i) + ", ");
            }
        }
        System.out.println("Tamano de la sucecion Fibonacci");
        int t2 = s.nextInt();
        Fibonacci x = new Fibonacci();
        x.fibo(t2);

    }
}
