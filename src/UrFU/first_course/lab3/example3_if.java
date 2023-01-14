package UrFU.first_course.lab3;

import java.util.Scanner;

public class example3_if {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажи количество чисел");
        int num = scanner.nextInt();
        int roll[] = new int[num];
        for (int i = 0; i <num; i++) {
            if (i == 0) roll[i] = 1;
            if (i == 1) roll[i] = 1;
            if (i > 1) roll[i] = roll[i - 1] + roll[i - 2];
            System.out.print(roll[i] + " ");
        }
    }
}
