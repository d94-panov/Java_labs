package UrFU.first_course.lab10;

//В программе, где требуется из матрицы вывести столбец с номером, заданным с
//клавиатуры, могут возникать ошибки в следующих случаях:
//– ввод строки вместо числа;
//– нет столбца с таким номером.

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Matrix();
        EPrintColumn();
    }

    private static int height;
    private static int width;
    private static int[][] MyMatrix;

    private static void Matrix() {
        try {
            PrintMatrix(CreateMatrix());
        } catch (NegativeArraySizeException e) {
            System.out.println("Указан некорректный размер матрицы");
            Matrix();
        } catch (InputMismatchException e) {
            System.out.println("Указан некорректный параметр матрицы");
            Matrix();
        }
    }

    private static void EPrintColumn() {
        try {
            PrintColumn();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Столбец за пределами матрицы");
            EPrintColumn();
        } catch (InputMismatchException e) {
            System.out.println("Указан некорректный параметр столбца");
            EPrintColumn();
        }
    }

    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println((j + 1) + (i + 1) + Array[j][i]);
            }
            System.out.println();
        }
    }

    private static int[][] CreateMatrix() {
        Random random = new Random(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите ширину матрицы: ");
        width = scanner.nextInt();

        System.out.println("Укажите высоту матрицы: ");
        height = scanner.nextInt();

        int[][] Matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Matrix[i][j] = random.nextInt(100);
            }
        }
        MyMatrix = Matrix;
        return Matrix;
    }

    private static void PrintColumn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("кажите столбец матрицы: ");
        int column = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println(column + (i + 1) + MyMatrix[column - 1][i]);
        }
    }
}
