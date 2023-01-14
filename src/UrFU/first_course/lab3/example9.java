package UrFU.first_course.lab3;

import java.util.Random;

public class example9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int[] min_count = new int[10];
        int[] min_nums = new int[10];
        int min = numbers[0];
        for (int l = 0; l < 2; l++) {
            for (int j = 0; j < numbers.length; j++) {
                if (min >= numbers[j]) {
                    min_count[j] = j;
                    min = numbers[j];
                    min_nums[j] = numbers[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "]" + min_nums[k] + "- минимальное значение");
            }
        }
    }
}
