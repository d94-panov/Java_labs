package UrFU.first_course.lab1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input surname: ");
        String surname = in.nextLine();
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input patronymis: ");
        String patronymis = in.nextLine();
        System.out.printf("Hallo %s %s %s", surname, name, patronymis);
        in.close();
    }
}