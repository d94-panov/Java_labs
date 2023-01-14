package UrFU.first_course.lab10;

public class Example1_1 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // шаг1, выводим на печать "0"
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 " + e); // исключение обработано. Шаг 2, выводим на печать "1" + исключение "Непроверяемая ошибка"
        }
        System.out.println("2"); // шаг 3, выводим на печать "2"
    }
}
