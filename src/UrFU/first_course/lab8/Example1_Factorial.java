package UrFU.first_course.lab8;

//Вычислить факториал числа n с использованием
//рекурсии.

public class Example1_Factorial {
    public static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}
