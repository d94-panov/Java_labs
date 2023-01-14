package UrFU.first_course.lab10;

public class Example1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new RuntimeException("ошибка"); // исключение не перехвачено
        } catch (NullPointerException e) {
            System.out.println("1" ); // эта часть не выполняется
        }
        System.out.println("2"); // эта часть не выполняется
    }
}
