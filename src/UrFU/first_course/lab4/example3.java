package UrFU.first_course.lab4;

public class example3 {
    public static void main(String[] args) {
        int[][] matrice = {{2, 2, 2},
                {2, 2, 2}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
