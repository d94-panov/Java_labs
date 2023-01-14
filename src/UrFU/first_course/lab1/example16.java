package UrFU.first_course.lab1;

import java.util.Scanner;

public class example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input number: ");
        int number = in.nextInt();

        int one_less = number - 1;

        int one_more = number + 1;

        int sum_squared = one_less * one_less + number * number + one_more * one_more
                + 2 * one_less * number + 2 * one_less * one_more + 2 * number * one_more;

        System.out.printf("%d %d %d %d", one_less, number, one_more, sum_squared);
        in.close();
    }
}