package com.mycompany.laab01;
public class Laab01 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                 break; // This will terminate the loop
                //continue; // This will skip the current iteration
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.println("I'm out of the loop now");
    }
    }

