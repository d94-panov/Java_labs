package UrFU.first_course.lab1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input first_number: ");
        int first_number = in.nextInt();

        System.out.print("Input second_number: ");
        int second_number = in.nextInt();

        int sum = first_number + second_number;

        System.out.printf("Sum: %d", sum);
        in.close();
    }
}