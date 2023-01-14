package UrFU.first_course.lab2;

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int d = sc.nextInt();
            if (d >= 5 & d <= 10) {
                System.out.println("Число в диапазоне от 5 до 10");
            } else
                System.out.println("Число не в диапазоне от 5 до 10");
        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова");
        }

    }
}