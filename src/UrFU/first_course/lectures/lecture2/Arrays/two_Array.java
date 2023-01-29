package UrFU.first_course.lectures.lecture2.Arrays;

public class two_Array {
    public static void main(String[] args) {
        int[][] twoArray = new int[3][4];
        twoArray[0][0] = 10;
        twoArray[0][1] = 12;
        twoArray[0][2] = -4;
        twoArray[0][3] = 11;
        twoArray[1][0] = 78;
        twoArray[1][1] = 30;
        twoArray[1][2] = 31;
        twoArray[1][3] = 22;
        twoArray[2][0] = 18;
        twoArray[2][1] = -9;
        twoArray[2][2] = 125;
        twoArray[2][3] = 37;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(twoArray[i][j]);
            }
        }
    }
}
