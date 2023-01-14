package UrFU.first_course.lab1;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input amount_of_days: ");
        int amount_of_days = in.nextInt();

        System.out.printf("%s contains %d days", month, amount_of_days);
        in.close();
    }
}
