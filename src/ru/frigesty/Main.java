package ru.frigesty;

public class Main {

    public static void main(String[] args) {
        char two = '2'; // = Оператор присвоения
        char aLetter = 97; // 97 по счёту символ в таблице Unicode

        boolean or = true; // true or false

        byte aByte = 17; //хранит целое число от -128 до 127 и занимает 1 байт
        short aShort = 140; //хранит целое число от -32768 до 32767 и занимает 2 байта
        int aInt = 65; //хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        long aLong = 930; //хранит целое число от +/- девяти квинтиллионов и занимает 8 байт
        float aFloat = 16.1F;
        double aDouble = 100.3;

        // + сложение
        // - вычитание
        // * умножение
        // / деление (целочисленное!)
        // % взятие остатка от деления

        // логические операторы
        // & И (&&)
        // | Или (||)
        // ! Отрицание
        // != не равно
        // == равно
        // instanceof проверка типа данных
        // > больше
        // >= больше или равно
        // < меньше
        // <= меньше или равно

        String aString = "Hello. qa.guru";
        System.out.println(aString);
        System.out.println("aByte+" + "aInt=" + plus(aByte, aInt));
        System.out.println("aLong-" + "aShort=" + minus((int) aLong, aShort));
        System.out.println("aByte*" + "aShort=" + multi(aByte, aShort));
        System.out.println("aLong/" + "aInt=" + share((int) aLong, aInt));
        System.out.println("aLong-" + "(aLong+" + "aShort)=" + left((int) aLong, aShort));
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
    static int multi(int a, int b) {
        return a * b;
    }
    static int share(int a, int b) {
        return a / b;
    }
    static int left(int a, int b) {
        return a % b;
    }

}
