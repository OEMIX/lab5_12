package com.company;

public class Main5 {

    public static void main(String[] args){
        int a[] = new int[15];
        int z = 0;
        for (int i = 0; i < 15; i++) {
            a[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<15 ;i++){
            int b =a[i]%2 ;
            if (b==0) {
                z++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println( );
        System.out.println("парних елементів : "+z);
    }
}
