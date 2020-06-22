package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task5 {

    public static void run() {
        
//    Построй частотный словарь букв русского алфавита.
//    На вход даем предложение(пример): «Это просто предложение»
//    На выходе должно вывести в консоль:
//    а - 5 раз
//    б - 1 раз
//    в - 0 раз
//    ...
//    я - 1 раз

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alphabetList = alphabet.toCharArray();

        String srt = "Это просто предложение";
        char[] srtList = srt.toCharArray();

        for (char elementAlp : alphabetList) {
            int i = 0;
            for (char elementStr : srtList) {
                if (elementStr == elementAlp) {
                    i++;
                }
            }
            System.out.println(elementAlp + " - " + i);
        }


    }
}

