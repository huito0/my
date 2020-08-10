package com.company;

import java.util.Scanner;

public class HarMyHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] myArray= new int[n][m];
        int maxn = 0;
        int maxm = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }
        int maxNumArray = myArray[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (myArray[i][j] > maxNumArray) {
                    maxNumArray = myArray[i][j];
                    maxn = i;
                    maxm = j;
                }
            }
        }
        System.out.println(maxn + " " + maxm);
    }
}
