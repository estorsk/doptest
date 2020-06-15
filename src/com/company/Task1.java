package com.company;

public class Task1 {

    public static void run1() {

//        Заполните массив случайным числами и выведете максимальное,
//        минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(),
//        который возвращает значение в промежутке [0, 1].

        int b;
        int max = 0;
        int min = 0;
        int[] arr = new int[10];
        int i = 0;

        for (i = 0; i < arr.length; i ++) {
            arr[i] = (int) Math.round((Math.random() * 1));
        }

        for (i = 0; i < arr.length; i ++){
            System.out.println("Random " + i + ": " + arr[i]);
        }

        max = arr[0];
        for (i = 0; i < arr.length; i ++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        min = arr[0];
        for (i = 0; i < arr.length; i ++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        b = (min+max)/2;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("B: " + b);

    }
}
