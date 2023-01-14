package UrFU.first_course.lab3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        if (sc.hasNextInt()) {
            int size = sc.nextInt();
            if (size > 0) {
                System.out.println("Размер массива " + size);
                int[] numbers = new int[size];
                int x = 0;
                int i = 0;
                while (x < size) {
                    i++;
                    if (i % 5 == 2) {
                        numbers[x] = i;
                        System.out.println("Элемент массива [" + x + "] = " + numbers[x]);
                        x++;
                    }
                }
            }
        } else {
            System.out.println("Неверное число");
        }
    }
}
