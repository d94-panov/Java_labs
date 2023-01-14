package UrFU.first_course.lab4;

public class example4 {
    public static void main(String[] args) {
        int[][] matrice = {{1},
                        {1, 2},
                        {1, 2, 3}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
