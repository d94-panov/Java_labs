package UrFU.first_course.lab2;

import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int d = sc.nextInt();
            if (d % 5 == 2) {
                System.out.println("При делении на 5 остаток 2");
            } else
                System.out.println("При делении на 5 остаток не 2");

            if (d % 7 == 1) {
                System.out.println("При делении на 7 остаток 1");
            } else
                System.out.println("При делении на 7 остаток не 1");

        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова");
        }

    }
}
