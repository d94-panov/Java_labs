package UrFU.first_course.lab10;

public class Example1_9 {
    public static int m(){
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            return 55; // 2. выход из метода
        } finally {
            System.out.println("1"); // 3. Выводим на печать "1"
        } }
    public static void main(String[] args) {
        System.out.println(m()); // 4. Выводим на печать "55"
    }
}
