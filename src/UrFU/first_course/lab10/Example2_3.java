package UrFU.first_course.lab10;

//В программе, вычисляющей сумму элементов типа byte одномерного массива,
//вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– ввод или вычисление значения за границами диапазона типа.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        ESetArray();
    }

    private static byte[] Array;

    private static void ESetArray() {
        try {
            SetArray();
        } catch (InputMismatchException e) {
            System.out.println("Укажите корректное значение");
            ESetArray();
        } catch (Exception e) {
            System.out.println("Ошибка");
            ESetArray();
        }
    }

    static class ByteExcept extends InputMismatchException {
        ByteExcept() {
            super("Число вне диапазона byte");
        }
    }

    private static void EInput(int i) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите элемент массива");
            int temp = 0;
            try {
                temp = scanner.nextInt();
                if (temp < -128 || temp > 127) {
                    throw new ByteExcept();
                }
            } catch (ByteExcept e) {
                System.out.println("Число вне диапазона byte");
                EInput(i);
            }
            Array[i] = (byte) temp;
        } catch (InputMismatchException e) {
            System.out.println("Укажите число");
            EInput(i);
        }
    }

    private static void SetArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int a = scanner.nextInt();
        Array = new byte[a];
        for (int i = 0; i < a; i++) {
            EInput(i);
        }
    }

    private static void SumArray(byte[] InArray) {
        int a = 0;
        for (int j : InArray) {
            a += (int) j;
        }
        System.out.println("Сумма элементов массива = " + a);
    }
}
