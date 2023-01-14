package UrFU.first_course.lab10;

public class Example1_6 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1"); // эта часть не выполняется
        } catch (RuntimeException e) {
            System.out.println("3"); // поменяли строки местами. Шаг 2, исключение обработано, выводим "3"
        } catch (Exception e) {
            System.out.println("2"); // исключение уже обработано, поэтому эта часть не выполняется
        }
        System.out.println("4"); // 4. Выводим на печать "4"
    }
}
