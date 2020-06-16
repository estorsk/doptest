package com.company;

public class Task3 {

    public static void run(){

//      Реализовать алгоритм сортировки пузырьком для сортировки массива.

        int size = 5;
        int[] arr = new int[size];

        for(int i = 0; i < size; i ++){
            arr[i] = (int) Math.round(Math.random() * 9);
        }

        for(int j = 0; j < size; j ++) {
            int n = 0;
            for (int i = n + 1; i < size; i++) {
                for (n = i - 1; n < i; n++) {
                    if (arr[i] < arr[n]) {
                        int t = arr[i];
                        arr[i] = arr[n];
                        arr[n] = t;
                    }
                }
            }
            size = size -1;
            n = 0;
            int i = 0;
        }

        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }

    }
}
