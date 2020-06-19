package com.company;

import java.util.*;

public class Task4 {

    public static void run(){

//        Удаление из массива
//        Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).

        List<Integer> arr = new ArrayList<>();

//        Заполнение массива рандомными числами
        for (int i = 0; i < 30; i++){
            arr.add((int) Math.round(Math.random() * 10));
        }

        System.out.println("--------------------------------------------");
        System.out.println();

//        Вывод текущего массива
        System.out.println("Random = " + arr);

//        Поиск числа в массиве и удаление
        for(Iterator<Integer> arrIterator = arr.iterator(); arrIterator.hasNext();){
            Integer arrNext = arrIterator.next();
            if (arrNext == 4){
                arrIterator.remove();
            }
        }


//        Вывод массива в консоль
        System.out.println("Answer = " + arr);

        System.out.println();
        System.out.println("--------------------------------------------");

    }

}
