package UrFU.first_course.lectures.lecture3;

import java.util.Random;

public class class_Random {
    public static void main(String[] args) {
        // Случайное число от 1 до 6
        Random rnd = new Random();
        int number = rnd.nextInt(6) + 1;
        System.out.println("Random number: " + number);

        // Сравнение двух случайных значений
        Random rnd1 = new Random(1L);
        Random rnd2 = new Random(1L);
        boolean test = rnd1.nextInt(6) == rnd2.nextInt(6);
        System.out.println("Test: " + test);

        // Заполнение массива случайными значениями
        int[][] twoDimArray = new int[3][4];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimArray[i][j] = random.nextInt(100);
                System.out.println(twoDimArray[i][j]);
            }
        }
    }
}
