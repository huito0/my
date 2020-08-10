package com.company;

import java.util.Scanner;

public class NextHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] myArray = new String[5];
        for (int i = 0; i < myArray.length; i++) { //Создаем массив строк
            myArray[i] = sc.nextLine();
        }
        int min = myArray[0].length();
        String count = "";
        for (int i = 0; i < myArray.length; i++) { //Находим самый маленький размер строки
            if (myArray[i].length() <= min) {
                min = myArray[i].length();
            }
        }
        for (int i = 0; i < myArray.length; i++) { //Выводим строки с размером равным минимальному
            if (myArray[i].length() == min) {
                System.out.println(myArray[i]);
            }
        }
    }
}
