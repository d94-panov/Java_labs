package UrFU.first_course.lectures.lecture2.Arrays;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray1; // объявление переменной
        intArray1 = new int[5]; // присваивание ссылки переменной

        // Объявление массива и добавление элементов
        int[] intArray2 = {1, 2, 3, 4, 100, 25};

        // Объявление масива с заданным размером
        int[] intArray3 = new int[10];
        intArray3[0] = 1;
        intArray3[1] = 2;
        intArray3[2] = 3;
        intArray3[3] = 4;
        intArray3[4] = 2;

        int[] arrayInt = new int[10];
        Random random = new Random(100);
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
            System.out.println(arrayInt[i]);
        }
        System.out.println();

        // Создание массива с размером 8
        int[] arrayInt1 = new int[8];
        String[] arrayString = new String[8];

        // Присваивание значений каждому элементу массива
        arrayInt1[0] = 1;
        arrayInt1[1] = 15;
        arrayInt1[2] = 25;
        arrayInt1[3] = 20;
        arrayInt1[4] = 39;
        arrayInt1[5] = 1000;
        arrayInt1[6] = 10;
        arrayInt1[7] = 7;
        arrayString[0] = "Надо ";
        arrayString[1] = "больше ";
        arrayString[2] = "практики ";
        arrayString[3] = "в ";
        arrayString[4] = "програ";
        arrayString[5] = "ммирова";
        arrayString[6] = "нии";
        arrayString[7] = "!";

        // Вывод элеметнов массива в консоль
        System.out.println("Вывод элеметнов массива в консоль: ");
        for (int j : arrayInt1) {
            System.out.println(j);
        }
        for (String j : arrayString) {
            System.out.print(j);
        }
    }
}
