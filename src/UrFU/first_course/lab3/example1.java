package UrFU.first_course.lab3;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веди число от 1 до 7");
        int num = scanner.nextInt();
        switch (num){
            case 1 :
                System.out.println("Понедельник");
                break;
            case 2 :
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case 4 :
                System.out.println("Четверг");
                break;
            case 5 :
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7 :
                System.out.println("Воскресеньне");
                break;
            default:
                System.out.println("Введено число вне указанного диапазона");
        }
    }
}