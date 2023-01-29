package UrFU.first_course.lectures.lecture2.Loops;

public class Operator_return {
    public static void main(String[] args) {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            if (i == 5) {
                return; // выходит из метода, поэтому не выводит "Конец"
            }
            System.out.println(array[i]);
        }
        System.out.println("Конец");
    }
}
