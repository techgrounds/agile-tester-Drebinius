package AdvancedLoops;

import java.sql.Array;
import java.util.ArrayList;

public class Fibo {
    public static void main(String[] args) {
        ArrayList<Integer> fibona = new ArrayList<Integer>();
        int a = 0, b = 1, fib;
        fibona.add(a);
        fibona.add(b);

        for (int i=0; i <= 50; i++) {                                                                           //OPDR4.1
            fib = a + b;
            a = b;
            b = fib;
            fibona.add(fib);
            System.out.println(fib);
        }
    }
}


