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

        String alphabet = "а,б,в,г,д,е,ё,ж,з,и,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ъ,ы,ь,э,ю,я";
        String[] alphabetList = alphabet.split(",");

        String srt = "Это просто предложение";
        String[] srtList = srt.split("");

        for (String elementAlp : alphabetList) {
            int i = 0;
            for (String elementStr : srtList) {
                boolean result = elementAlp.equalsIgnoreCase(elementStr);
                if (result == true) {
                    i++;
                }
            }
            System.out.println(elementAlp + " - " + i);
        }


    }
}

