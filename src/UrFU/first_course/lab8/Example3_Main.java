package UrFU.first_course.lab8;

//Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
//Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.

import java.util.Scanner;

public class Example3_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int Size = scanner.nextInt();
        Example3_Rec R = new Example3_Rec(Size);
    }
}
