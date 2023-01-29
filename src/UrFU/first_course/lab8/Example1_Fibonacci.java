package UrFU.first_course.lab8;

//Вывести число Фибоначчи, заданное его номером в
//последовательности.

public class Example1_Fibonacci {
    public static int s = 0;
    public static int f(int n) {
        rec();
        System.out.println("" + n + "-> ");
        s++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }

    public static void rec() {
        for (int i = 0; i < s; i++) {
            System.out.println();
        }
    }
}
