package UrFU.first_course.lab1;

import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year_of_birth: ");
        int year_of_birth = in.nextInt();

        System.out.printf("%s %d", name, year_of_birth);
        in.close();
    }
}