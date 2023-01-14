package UrFU.first_course.lab10;

public class Example1_10 {
    public static int m(){
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            return 15; // 2. выход из метода
        } finally {
            System.out.println("1"); // 3. Выводим на печать "1"
            return 20; // 4. выход из метода
        } }
    public static void main(String[] args) {
        System.out.println(m()); // 5. Выводим на печать "20"
    }
}
