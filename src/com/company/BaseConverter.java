package com.company;


public class BaseConverter {

    public static void convert(){

//        Напиши класс BaseConverter для конвертации из градусов по Цельсию в
//        Кельвины​, ​Фаренгейты​, и так далее. У метода должен быть метод convert, который
//        и делает конвертацию.

        double tCel = -20;

//        Перевод в Фаренгейты
        double tFar = (double) 9/5 * tCel + 32;
        System.out.println("По Фаренгейту = " + tFar);

//        Перевод в Кельвины
        double tKel = (double) tCel + 273.15;
        System.out.println("По Кельвину = " + tKel);
        

    }
}
