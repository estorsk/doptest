package com.company;


public class BaseConverter {

    public static void convert(String type, Integer value) {

//        Напиши класс BaseConverter для конвертации из градусов по Цельсию в
//        Кельвины​, ​Фаренгейты​, и так далее. У метода должен быть метод convert, который
//        и делает конвертацию.

        if(type == "По Цельсию"){
            System.out.println("По Цельсию = " + value);
        }else if (type == "По Фаренгейту"){
            double tFar = (double) 9/5 * value + 32;
            System.out.println("По Фаренгейту = " + tFar);
        }  else if (type == "По Кельвину"){
            double tKel = (double) value + 273.15;
            System.out.println("По Кельвину = " + tKel);
        } else if (type == "По Реомюру"){
            double tReo = (double) value * 0.8;
            System.out.println("По Реомюру = " + tReo);
        }

    }

}
