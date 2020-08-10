package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class NextQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine() + " ";
        String b = "";
        boolean tok = true;
        int count = 0;
        while (tok) {
            b = b.concat(a);
            a = sc.nextLine() + " ";
            count++;
            if (a.equals("end ")) {
                tok = false;
            }
        }
        String[] myArray = b.split(" ");
        int[] myArrayInt = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            myArrayInt[i] = Integer.parseInt(myArray[i]);
        }
        int[][] myArrayMas = new int[count][myArrayInt.length / count];
        int p = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < myArrayInt.length / count; j++) {
                myArrayMas[i][j] = myArrayInt[p];
                p++;
            }
        }
        int[][] myArrayFinal = new int[count][myArrayInt.length / count];
        int mm = count;
        int nn = myArrayInt.length / count;
        int mmm = 0;
        int nnn = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < myArrayInt.length / count; j++) {
                myArrayFinal[i][j] = myArrayMas[(i - 1 + mm) % mm][j] + myArrayMas[(i + 1 + mm) % mm][j] + myArrayMas[i][(j - 1 + nn) % nn] + myArrayMas[i][(j + 1 + nn) % nn];
                System.out.print(myArrayFinal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
