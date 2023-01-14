package UrFU.first_course.lab10;

public class Example1_11 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" ); // 2. исключение обработано, выводим на печать "1"
        }finally {
            System.out.println("2" ); // 3. Выводим на печать "2"
        }
        System.out.println("3"); // 4. Выводим на печать "3"
    }
}
