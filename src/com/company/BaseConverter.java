package com.company;


public class BaseConverter {

    public static double convert(Enum type, Integer value) {

//        Напиши класс BaseConverter для конвертации из градусов по Цельсию в
//        Кельвины​, ​Фаренгейты​, и так далее. У метода должен быть метод convert, который
//        и делает конвертацию.

        if(type == TypeCurrent.Celsius){
            System.out.println("По Цельсию = " + value);
        }else if (type == TypeCurrent.Fahrenheit){
            double tFar = (double) 9/5 * value + 32;
            System.out.println("По Фаренгейту = " + tFar);
        }  else if (type == TypeCurrent.Kelvin){
            double tKel = (double) value + 273.15;
            System.out.println("По Кельвину = " + tKel);
        } else if (type == TypeCurrent.Reaumur){
            double tReo = (double) value * 0.8;
            System.out.println("По Реомюру = " + tReo);
        }

        return 0;
    }

    public enum TypeCurrent{
        Celsius, Fahrenheit,Kelvin, Reaumur;
    }

}
