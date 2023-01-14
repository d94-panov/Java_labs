package UrFU.first_course.lab6;

//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
//Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
//использовать формулу 12 + 22 +32+…+n2 =(n+l) (2n + 1)/6

public class Example5 {
    public static void main(String[] args) {
        int n = 6;
        int sq0 = (n * (n + 1) * (2 * n + 1) / 6);
        boolean test;

        System.out.println("Рекурсивный метод");
        int sq1 = sum1.squareSum1(n);
        test = sq1 == sq0;
        System.out.println("Сумма квадратов " + "\"" + n + "\"" + " = " + sq1 + " (" + test + ")");

        System.out.println("Метод без рекрусии");
        int sq2 = sum1.sum2(n);
        test = sq2 == sq0;
        System.out.println("Сумма квадратов " + "\"" + n + "\"" + " = " + sq2 + " (" + test + ")");
    }

    private static class sum1 {
        private static int squareSum1(int n) { // рекурсивный метод
            int result = 0;
            System.out.println("*" + n);
            if (n <= 1) return 1;
            result *= squareSum1(n - 1) + n * n;
            return result;
        }

        private static int sum2(int n) { // метод без рекрусии
            int result = 0;
            int j = n;
            int s = 2;
            for (int i = n; i > 0; i--) {
                System.out.println("*" + j);
                result = (int) Math.pow(j, s) + result;
                j--;
            }
            return result;
        }
    }
}
