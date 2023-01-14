package UrFU.first_course.lab1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input day: ");
        String day = in.nextLine();

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input date: ");
        int date = in.nextInt();

        System.out.printf("%s, %d, %s", day, date, month);
        in.close();
    }
}