package UrFU.first_course.lab1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input your_age: ");
        int your_age = in.nextInt();

        int age = 2022 - your_age;

        System.out.printf("Year of birth: %d", age);
        in.close();
    }
}