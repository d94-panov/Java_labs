package UrFU.first_course.lectures.lecture2.Loops;

public class Nested_Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("i на текущей итерации = " + i);
                System.out.println("н на текущей итерации = " + y);
            }
        }
    }
}
