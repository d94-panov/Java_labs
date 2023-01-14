package UrFU.first_course.lab3;

import java.util.Random;
import java.util.Scanner;

public class example5_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите кол-во чисел");
        int kolvo = sc.nextInt();

        int sum = 0;
        Random random = new Random();
        int x = kolvo;
        while (x > 0) {
            int nums = random.nextInt(1000);
            if (nums % 5 == 2 || nums % 3 == 1) {
                System.out.printf("%d, ", nums);
                sum = sum + nums;
                x--;
            }
        }
        System.out.printf("Сумма чисел: %d", sum);
    }
}
