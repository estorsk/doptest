package com.company;

import java.util.*;

public class Task3 {

    public static void run(){

//      Реализовать алгоритм сортировки пузырьком для сортировки массива.

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 10; i ++) {
            arr.add((int) Math.round(Math.random() * 9));
        }

        System.out.print(" " + arr + " ");

//        Сортировка коллекции массива
        Collections.sort(arr);

//        Вывод отсортированного массива
        System.out.println();
        System.out.print(" " + arr + " ");
        System.out.println();

//        for(int j = 0; j < size; j ++) {
//            int n = 0;
//            for (int i = n + 1; i < size; i++) {
//                for (n = i - 1; n < i; n++) {
//                    if (arr[i] < arr[n]) {
//                        int t = arr[i];
//                        arr[i] = arr[n];
//                        arr[n] = t;
//                    }
//                }
//            }
//            size = size -1;
//            n = 0;
//            int i = 0;
//        }

    }
}
