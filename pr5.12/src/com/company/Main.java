package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[50];
        int i = 1;
        int j = 0;
        for (; i <= 99 ; i = i +2, j++) {
            a[j] = i;
            System.out.println(a[j]);
        }
    }
}
