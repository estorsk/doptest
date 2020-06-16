package com.company;

public class Task4 {

    public static void run(){

//        Удаление из массива
//        Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).

        int size = 15;
        int[] arr = new int[size];

//        Заполнение массива рандомными числами
        for (int i = 0; i < size; i ++){
            arr[i] = (int) Math.round(Math.random() * 10);
        }

        for (int i = 0; i < size; i ++){
            System.out.print(" " + arr[i] + " ");
        }


//        Поиск number и перенос в конец массива
        int score = 0;
        for (int i = 0; i < size - score; i ++){
            int number = 4; //Целое число
            int p = i;
            if (arr[i] == number){
                for (int j = p + 1; j < arr.length; j ++) {
                    arr[p] = arr[j];
                    arr[j] = number;
                    p++;
                }
                score++; // Считаем кол-во number в массиве
            }
        }

//        Удаление конец массива на кол-во number
        size = size - score;
        System.out.println();

//        Вывод массива в консоль
        for (int i = 0; i < size; i ++){
            System.out.print(" " + arr[i] + " ");
        }

        System.out.println();


    }

}
