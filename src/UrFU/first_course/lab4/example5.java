package UrFU.first_course.lab4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int[][] massiv = new int[3][5];
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(100);
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        int[][] massiv2 = new int[5][3];
        for (int i = 0; i < massiv2.length; i++) {
            for (int j = 0; j < massiv2[i].length; j++) {
                massiv2[i][j] = massiv[j][i];
                System.out.print(massiv2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
