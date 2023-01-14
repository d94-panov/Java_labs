package UrFU.first_course.lab3;

import java.util.Scanner;

public class example5_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите кол-во чисел");
        int Kolvo = sc.nextInt();

        int sum = 0;
        for (int i = 0; Kolvo > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.printf("%d, ", i);
                sum = sum + i;
                Kolvo--;
            }
        }
        System.out.printf("Сумма чисел: %d", sum);
    }
}
