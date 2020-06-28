package com.company;

public class Task7 {

//    Необходимо написать метод, который бы возвращал из 2 чисел
//    меньшее число. Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
//    Метод должен ВОЗВРАЩАТЬ метод, а выводить его нужно уже в Main классе

    protected static int min(Integer value1, Integer value2) {

        if (value1 < value2){
            return value1;
        } else {
            return value2;
        }

    }

    public static int numbers() {
        return min(221,20);
    }

}
