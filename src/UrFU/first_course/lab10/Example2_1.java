package UrFU.first_course.lab10;

//В программе, вычисляющей среднее значение среди положительных элементов
//одномерного массива (тип элементов int), вводимого с клавиатуры, могут
//возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– несоответствие числового типа данных;
//– положительные элементы отсутствуют.

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        try {
            AverageValue(SetArray());
        } catch (NullPointerException e) {
            System.out.println("Нет элементов массива для расчета");
        } catch (Exception e) {
            System.out.println("Некорректный ввод данных");
        }
    }

    private static int[] SetArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int x = scanner.nextInt();
        int[] Array = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Укажите элемент массива");
            Array[i] = scanner.nextInt();
        }
        return Array;
    }

    private static void AverageValue(int[] InArray) {
        double a = 0;
        boolean flag = false;
        for (int j : InArray) {
            if (j > 0) {
                a += j;
            } else if (j == 0) {
                flag = true;
            }
        }
        if (a <= 0 && !flag) {
            throw new NullPointerException("Нет положительных элементов массива");
        }
        double y = a / InArray.length;
        System.out.println("Среднее значение положительных элементов массива = " + y);
    }
}
