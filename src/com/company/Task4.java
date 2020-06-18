package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void run(){

//        Удаление из массива
//        Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).
        List<Integer> arr = new ArrayList<>();

//        Заполнение массива рандомными числами
        for (int i = 0; i < 10; i++){
            arr.add((int) Math.round(Math.random() * 10));
        }

        System.out.println("--------------------------------------------");
        System.out.println();

//        Вывод текущего массива
        System.out.println("Random = " + arr);

//        Поиск number и перенос в конец массива
        List<Integer> itemsToRemove = new ArrayList<Integer>();
        for (Integer elementArr : arr){
            if (elementArr.intValue() == 5){
                itemsToRemove.add(elementArr);
            }
        }
        arr.removeAll(itemsToRemove);


//        Вывод массива в консоль
        System.out.println("Answer = " + arr);

        System.out.println();
        System.out.println("--------------------------------------------");

    }

}
