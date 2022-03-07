package com.company;

import java.util.*;

public class Primos {

    public List<Integer> calcularPrimos(int n) {
        List<Integer> array = new ArrayList<Integer>();

        int i = 0;
        while (array.size() < n) {
            if(esPrimo(i)){
                array.add(i);
            }
            i++;
        }
        return array;
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
