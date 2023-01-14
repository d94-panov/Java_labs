package UrFU.first_course.lab10;

public class Example1_8 {
    public static int m() {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new RuntimeException(); // исключение не перехвачено, ошибка
        } finally {
            System.out.println("1"); // 2. Выводится на печать "1"
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
