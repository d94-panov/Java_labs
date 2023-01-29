package UrFU.first_course.lectures.lecture2.Loops;

public class Loop_for_each {
    public static void main(String[] args) {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int j : array) {
            System.out.println(j);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
