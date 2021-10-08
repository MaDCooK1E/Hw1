package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        Fact(1, n);

    }

    public static void Fact(int fact, int n) {
        fact *= n--;
        if (n == 1) {
            System.out.println(fact);
        } else {
            Fact(fact, n);
        }

    }

}
