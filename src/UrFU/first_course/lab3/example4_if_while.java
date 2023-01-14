package UrFU.first_course.lab3;

import java.util.Scanner;

public class example4_if_while {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = s.nextInt();
        System.out.println("Введите второе число ");
        int num2 = s.nextInt();
        if (num1 < num2) {
            int i = num1;
            while (i <= num2) {
                System.out.printf("%d ", i++);
            }
        } else {
            int i = num2;
            while (i <= num1) {
                System.out.printf("%d ", i++);
            }
        }
    }
}