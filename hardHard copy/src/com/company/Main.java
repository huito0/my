package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        if (a <= 0) {
            System.out.println();
        } else {
            int[] myArray = new int[a];
            for (int j = 0; j < a; j++) {
                    myArray[j] = sc.nextInt();
            }
            for (int i = 0; i < a - 1; i++) {
                if (myArray[i] > myArray[i + 1] && myArray[i] > max) {
                    max = myArray[i];
                } else if (myArray[i] < myArray[i + 1] && myArray[i + 1] > max) {
                    max = myArray[i + 1];
                }
            }
            System.out.println(max);
        }
    }
}