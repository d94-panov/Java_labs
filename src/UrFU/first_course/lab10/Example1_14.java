package UrFU.first_course.lab10;

public class Example1_14 {
    public static void m(int x) throws ArithmeticException{ // исключение перехватывается, т.к. делается расширение метода
        int h=10/x; // происходит деление на 0
    }
    public static void main(String[] args) {
        try {
            int l = args.length; // 1. Переменной l присваивается значение 0
            System.out.println("размер массива= " + l); // 2. Выводим на печать "размер массива= " 0
            m(l); // 3. передаем аргумент 0
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль"); // 5. исключение обработано, выводим на печать "Ошибка: Деление на ноль"
        }
    }
}
