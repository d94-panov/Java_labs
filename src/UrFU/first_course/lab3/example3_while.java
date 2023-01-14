package UrFU.first_course.lab3;

import java.util.Scanner;

public class example3_while {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажи количество чисел");
        int num = scanner.nextInt();
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + " " + a2);
        int fib = 2;
        int i = 2;
        while (i < num) {
            fib = a1 + a2;
            a1 = a2;
            a2 = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}
