package UrFU.first_course.lab1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input year_of_birth: ");
        int year_of_birth = in.nextInt();

        int age = 2022 - year_of_birth;

        System.out.printf("Your age: %d", age);
        in.close();
    }
}