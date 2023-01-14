package UrFU.first_course.lab4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int massiv1[][] = new int[5][7];
        for (int i = 0; i < massiv1.length; i++) {
            for (int j = 0; j < massiv1[i].length; j++) {
                massiv1[i][j] = random.nextInt(100);
                System.out.print(massiv1[i][j] + " ");
            }
            System.out.println();
        }

        int delStrok = random.nextInt(4);
        int delStolb = random.nextInt(6);
        System.out.println("Удалена строка " + (delStrok) + "; Удален столбец " + (delStolb));

        int massiv2[][] = new int[4][6];
        for (int i = 0, s = 0; i < massiv2.length; s++) {
            if (s != delStrok) {
                for (int j = 0, k = 0; j < massiv2[i].length; k++) {
                    if (k != delStolb) {
                        massiv2[i][j] = massiv1[s][k];
                        System.out.print(massiv2[i][j] + " ");
                        j++;
                    }
                }
                System.out.println();
                i++;
            }
        }
    }
}

