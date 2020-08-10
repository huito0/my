package com.company;

import java.util.Scanner;

public class ToHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] my = sc.nextLine().split("-");
        System.out.println(my[1] + "/" + my[2] + "/" + my[0]);
    }
}
