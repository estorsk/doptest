package com.company;

public class Task2 {

    public static void run2() {

//  Напиши программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//  Используй для решения этой задачи оператор "%" (остаток от деления) и циклы.

        int[] arr = new int[100];
        int i = 2;
        int a = 2;

        for (i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (i = 2; i < arr.length; i++) {
            for (a = 2; a*a <= arr[i]; a++){
                while(arr[i] % a == 0){
                    arr[i] = 1;
                    break;
                }
            }
        }

        for (i = 2; i < arr.length; i++) {
            while(arr[i] != 1){
                System.out.println("Easy = " + arr[i]);
                break;
            }
        }

    }
}
