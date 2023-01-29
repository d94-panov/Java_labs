package UrFU.first_course.lectures.lecture5;

import java.util.Scanner;

public class StaticBlock {
    static String a; // статичкская переменная a

    static { // статический блок
        System.out.println("Статический блок инициализирован.");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine(); // присваиваем значение (инициализируем)
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}
