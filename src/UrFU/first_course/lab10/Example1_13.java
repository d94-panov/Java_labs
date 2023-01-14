package UrFU.first_course.lab10;

public class Example1_13 {
    public static void main(String[] args) {
        try {
            int l = args.length; // 1. Переменной l присваивается значение 0
            System.out.println("размер массива= " + l); // 2. Выводим на печать "размер массива= " 0
            int h=10/l; // 3. переменная l=0, поэтому в этой строке происходит деление на 0
            args[l + 1] = "10"; // эта часть не выполняется из-за ошибки
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль"); // 4. исключение обработано, выводим на печать "Деление на ноль"
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует"); // эта часть не выполняется
        }
    }
}
