package UrFU.first_course.lab8;

//Создать приложение с использованием рекурсии для перевода
//целого числа, введенного с клавиатуры, в двоичную систему счисления.

import java.util.Scanner;

public class Example2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        Example2_Rec BinRec = new Example2_Rec(x);
    }
}
