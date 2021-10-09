package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        fact(1, n);

    }

    public static void fact(int fact, int n) {
        fact *= n--;
        if (n == 1) {
            System.out.println(fact);
        } else {
            fact(fact, n);
        }

    }

}

