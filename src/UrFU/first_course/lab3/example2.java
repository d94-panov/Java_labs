package UrFU.first_course.lab3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веди название дня недели");
        String day = scanner.nextLine();
        switch (day){
            case "понедельник" :
                System.out.println("Порядковый номер дня недели 1");
                break;
            case "вторник" :
                System.out.println("Порядковый номер дня недели 2");
                break;
            case "среда" :
                System.out.println("Порядковый номер дня недели 3");
                break;
            case "четверг" :
                System.out.println("Порядковый номер дня недели 4");
                break;
            case "пятница" :
                System.out.println("Порядковый номер дня недели 5");
                break;
            case "суббота" :
                System.out.println("Порядковый номер дня недели 6");
                break;
            case "воскресенье" :
                System.out.println("Порядковый номер дня недели 7");
                break;
            default:
                System.out.println("Такого дня недели нет");
        }
    }
}