package UrFU.first_course.lectures.lecture1;

import java.util.Scanner;

public class if_else_if_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число ");
        int x = in.nextInt();
        if (x > 0){
            System.out.println("x > 0");
        } else if (x == 0){
            System.out.println("x = 0" );
        } else {
            System.out.println("x < 0");
        }

        System.out.print("Введи день недели ");
        String day = in.nextLine();
        switch (day){
            case "Понедельник":
                System.out.println("Понедельник");
                break;
            case "Вторник":
                System.out.println("Вторник");
                break;
            case "Среда":
                System.out.println("Среда");
                break;
            default:
                System.out.println("Что-то не то");
        }
    }
}
