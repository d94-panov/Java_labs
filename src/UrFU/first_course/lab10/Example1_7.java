package UrFU.first_course.lab10;

public class Example1_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new NullPointerException("ошибка"); // исключение перехвачено
        } catch (NullPointerException e) {
            System.out.println("1" ); // 2. исключение обработано, выводим на печать "1"
            throw new ArithmeticException(); // исключение не перехвачено, для перехвата данного исключения необходимо создать новый обработчик
        }catch (ArithmeticException e) {
            System.out.println("2" ); // исключение не перехвачено, т.к. нет еще одной конструкции try-catch
        }
        System.out.println("3"); // код не выполняется
    }
}
