package com.company;

public class Main {

    public static void main(String[] args) {

        BaseConverter.convert(BaseConverter.typeCurrent.celsius, 10);
        BaseConverter.convert(BaseConverter.typeCurrent.fahrenheit, 10);
        BaseConverter.convert(BaseConverter.typeCurrent.kelvin, 10);
        BaseConverter.convert(BaseConverter.typeCurrent.reaumur, 17);

    }
}
