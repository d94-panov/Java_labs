package UrFU.first_course.lectures.lecture2.Arrays;

public class three_Array {
    public static void main(String[] args) {
        // Создание трехмерного массива
        int[][][] threeArray = new int[2][][];

        // Создание вложенных двумерных массивов
        threeArray[0] = new int[2][3];
        threeArray[1] = new int[2][3];

        //Заполнение данными первого двумерного массива
        threeArray[0][0][0] = 10;
        threeArray[0][0][1] = 12;
        threeArray[0][0][2] = -5;

        threeArray[0][1][0] = 1;
        threeArray[0][1][1] = 22;
        threeArray[0][0][2] = 134;

        // Заполнение данными второго двумерного массива
        threeArray[1][0][0] = 10;
        threeArray[1][0][1] = 12;
        threeArray[1][0][2] = 43;

        threeArray[1][1][0] = 78;
        threeArray[1][1][1] = 30;
        threeArray[1][1][2] = 222;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + threeArray[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
