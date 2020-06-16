package com.company;

public class Task3 {

    public static void run3(){

//      Реализовать алгоритм сортировки пузырьком для сортировки массива.

        int i = 0;
        int p = 10;
        int[] arr = new int[p];
        int n = 0;
        int t = 0;
        int j = 0;

        for(i = 0; i < arr.length; i ++){
            arr[i] = (int) Math.round(Math.random() * 9);
        }

        for(j = 0; j < p; j ++) {
            for (i = n + 1; i < p; i++) {
                for (n = i - 1; n < i; n++) {
                    if (arr[i] < arr[n]) {
                        t = arr[i];
                        arr[i] = arr[n];
                        arr[n] = t;
                    }
                }
            }
            p = p -1;
            n = 0;
            i = 0;
        }

        for (i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }

    }
}
