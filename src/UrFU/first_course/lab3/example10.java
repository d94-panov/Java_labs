package UrFU.first_course.lab3;

import java.util.Random;

public class example10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int m = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = m;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("" + numbers[i]);
        }
    }
}
