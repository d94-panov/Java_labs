package UrFU.first_course.lab5;

//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int int1 = sc.nextInt();
        System.out.println("Введите второе число");
        int int2 = sc.nextInt();
        Task myTask1 = new Task();
        Task myTask2 = new Task(int1);
        Task myTask3 = new Task(int1, int2);
    }

    static class Task { // класс с двумя целочисленными полями
        private int num1;
        private int num2;

        Task() { // конструктор, позволящий создавать объекты без передачи аргументов
            System.out.println("Создание объекта Task\n");
        }

        Task(int num1) { // конструктор, позволящий создавать объекты с передачей одного аргумента
            System.out.println("Создание объекта Task2");
            this.num1 = num1;
            System.out.println("num1^num1 = " + exponentOwnPow(num1) + "\n");
        }

        public int exponentOwnPow(int num1) {
            this.num1 = num1;
            int result = 1;
            for (int i = 1; i <= num1; i++) {
                result = num1 * result;
            }
            return result;
        }

        Task(int num1, int num2) { // конструктор, позволящий создавать объекты с передачей двух аргументов
            System.out.println("Создание объекта Task3");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = " + exponentPow(num1, num2) + "\n");
        }

        public int exponentPow(int n1, int n2) {
            n1 = num1;
            n2 = num2;
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result = num1 * result;
            }
            return result;
        }
    }
}