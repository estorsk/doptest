package com.company;

public class Task1 {

    public static void run() {

//        Заполните массив случайным числами и выведете максимальное,
//        минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(),
//        который возвращает значение в промежутке [0, 1].

        int b;
        int Max = 0;
        int Min = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i ++) {
            arr[i] = (int) Math.round((Math.random() * 1));
            System.out.println("Random " + i + ": " + arr[i]);
        }

        Max = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] >= Max) {
                Max = arr[i];
            }
        }

        Min = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] <= Min) {
                Min = arr[i];
            }
        }

        b = (Min+Max)/2;

        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);
        System.out.println("B: " + b);

    }
}
