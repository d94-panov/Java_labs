package UrFU.first_course.lectures.lecture2.Loops;

public class Operator_continue {
    public static void main(String[] args) {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
