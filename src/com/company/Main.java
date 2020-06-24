package com.company;

public class Main {

    public static void main(String[] args) {

        BaseConverter.convert(BaseConverter.TypeCurrent.Celsius, 10);
        BaseConverter.convert(BaseConverter.TypeCurrent.Fahrenheit, 10);
        BaseConverter.convert(BaseConverter.TypeCurrent.Kelvin, 10);
        BaseConverter.convert(BaseConverter.TypeCurrent.Reaumur, 17);

    }
}
