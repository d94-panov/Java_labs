package UrFU.first_course.lab2;

import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int d = sc.nextInt();
            if (d % 4 == 0) {
                System.out.println("Число делится на 4");
            } else
                System.out.println("Число не делится на 4");

            if (d >= 10) {
                System.out.println("Число больше 10");
            } else
                System.out.println("Число меньше 10");

        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова");
        }

    }
}
