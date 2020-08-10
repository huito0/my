package com.company;

import java.util.Scanner;

public class HarTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] myArray = new int[a][a];
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (myArray[i][j] != myArray[j][i]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}