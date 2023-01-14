package UrFU.first_course.lab3;

import java.util.Scanner;

public class example4_for_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число ");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }
        else for (int i = num2; i <= num1; i++) {
            System.out.print(i);
        }
    }
}