package com.company;

import java.util.ArrayList;

public class Task4 {

    public static void run(){

//        Удаление из массива
//        Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).

        int size = 10;
        ArrayList<Integer> arr = new ArrayList<>();

//        Заполнение массива рандомными числами
        for (int i = 0; i < size; i ++){
            arr.add(i, (int) Math.round(Math.random() * 10));
        }

        System.out.println("--------------------------------------------");
        System.out.println();

//        Вывод текущего массива
        System.out.println("Random = " + arr);


//        Поиск number и перенос в конец массива
        int score = 0;
        for (int i = 0; i < size - score; i ++){
            int number = 4; //Целое число
            int p = i;
            if (arr.get(i) == number){
                for (int j = p + 1; j < arr.size(); j ++) {
                    arr.set(p, arr.get(j));
                    arr.set(j, number);
                    p++;
                }
                score++; // Считаем кол-во number в массиве
            }
        }

//       Удаление конец массива на кол-во number
        if (score > 0){
            for (int i = 0; i < score; i ++){
                arr.remove(size - 1);
                size--;
            }
        }


//        Вывод массива в консоль
        System.out.println("Answer = " + arr);

        System.out.println();
        System.out.println("--------------------------------------------");

    }

}
