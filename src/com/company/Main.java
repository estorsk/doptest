package com.company;

import javax.swing.text.TabExpander;

import static com.company.Task7.numbers;

public class Main {

    public static void main(String[] args) {

//        BaseConverter.convert(BaseConverter.TypeCurrent.Celsius, 10);

//        Задание 7
        System.out.println("Минимальное число = " + Task7.numbers());
        System.out.println();

//        Задание 8
        System.out.println("Квадрат = " + Task8.sqrAndTow() + " and " + (Task8.sqrAndTow()+2));
        System.out.println();

//        Задание 8.1
        Task8.cube(3);
        System.out.println();

//        Задание 8.2
        Task8.sum();
        System.out.println();

//        Задание 9
        System.out.println("Return = " + Task9.littleBig5(15));
    }
}
