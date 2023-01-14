package UrFU.first_course.lab10;

public class Example1_2 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); // Unreachable statement, убираем строку
        } catch (Exception e) {
            System.out.println("2 "+ e ); // 2. исключение обработано, выводим "1" + исключение "Непроверяемая ошибка"
        }
        System.out.println("3"); // 3. Выводим на печать "3"
    }
}
