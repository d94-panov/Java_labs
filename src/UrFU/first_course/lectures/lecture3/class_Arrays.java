package UrFU.first_course.lectures.lecture3;

import java.util.Arrays;
import java.util.Random;

public class class_Arrays {
    public static void main(String[] args) {
        // Сортировка
        System.out.println("Сортировка:");
        Random random = new Random(); // создаем объект рандом
        int[] numbers = new int[10]; // создаем одномерный массив чисел
        System.out.println("перед сортировкой"); // выводим значения перед сортировкой

        for (int i = 0; i < 10; i++) { // заполняем массив случайными значениями
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i] + " ");
        }

        for (int i = numbers.length - 1; i > 0; i--) { // сортируем массив
            for (int j = 0; j < i; j++) {
                // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println(); // пустая строка
        System.out.println("после сортировки"); // выводим значения после сортировки
        for (int i = 0; i < 10; i++) { // печатаем значения в консоль
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        // Сортировка при помощи Arrays. Делает то же самое, что первая программа
        System.out.println("Сортировка при помощи Arrays:");
        Random random1 = new Random();
        int[] numbers1 = new int[10];
        System.out.println("перед сортировкой");

        for (int i = 0; i < 10; i++) {
            numbers1[i] = random.nextInt(100);
            System.out.println(numbers1[i] + " ");
        }
        Arrays.sort(numbers1); // Используем класс Arrays вместо вложенного цикла for
        System.out.println();
        System.out.println("после сортировки");

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers1[i] + " ");
        }
        System.out.println();


        // Копирование и вывод в консоль
        System.out.println("Копирование и вывод в консоль:");
        int[] numbers2 = {223, -7, 12, 26, 88, 49, 33, -776, 87, 21}; // создаем масси и добавляем в него элементы
        int[] numbers2Copy = Arrays.copyOf(numbers2, numbers2.length); // метод copyOf и передаем в него массив numbers2
        // вариант 1
        System.out.print("[");
        for (int i = 0; i < numbers2Copy.length; i++) {
            String str = (i == numbers2Copy.length - 1) ? "" : ", ";
            System.out.println(numbers2Copy[i] + str);
        }
        System.out.println("]"); // [223, -7, 12, 26, 88, 49, 33, -776, 87, 21]
        // вариант 2
        System.out.println(Arrays.toString(numbers2Copy)); // делает то же самое, что цикл for из варианта 1

        // Еще пример
        int[] numbers3 = {223, -7, 12, 26, 88, 49, 33, -776, 87, 21};
        int[] numbers3Copy = Arrays.copyOfRange(numbers3, 5, 8); // копируем элементы с 5 по 8
        System.out.println(Arrays.toString(numbers3Copy)); // [49, 33, -776]
        System.out.println();

        // Сравнение массивов
        System.out.println("Сравнение массивов:");
        int[] numbers4 = {10, 222, 39};
        int[] numbers5 = {10, 222, 39};
        System.out.println(numbers4.equals(numbers5)); // false
        System.out.println(Arrays.equals(numbers4, numbers5)); // true
        System.out.println();

        // Еще пример сравнения массивов
        System.out.println("Еще пример сравнения массивов:");
        int[][] numbers6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers6Copy = Arrays.copyOf(numbers6, numbers6.length);
        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbers6, numbers6Copy)); // true
        System.out.println(Arrays.deepToString(numbers6Copy)); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
