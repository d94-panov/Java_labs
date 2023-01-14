package UrFU.first_course.lab4;

public class example7 {
    public static void main(String[] args) {
        int[][] zmeika = new int[5][5];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < zmeika.length; h++) {
            for (int j = 0; j < zmeika.length - hvost; j++) {
                zmeika[i][j] = telo;
                telo++;
            }
            if (i < zmeika.length - 1) {
                i++;
            }
            for (int o = 4; o > hvost; o--) {
                zmeika[o][zmeika[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        for (int i = 0; i < zmeika.length; i++) {
            for (int j = 0; j < zmeika[i].length; j++) {
                if (zmeika[i][j] < 10) {
                    System.out.print(zmeika[i][j] + "  ");
                } else {
                    System.out.print(zmeika[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
