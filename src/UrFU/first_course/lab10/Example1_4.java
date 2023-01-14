package UrFU.first_course.lab10;

public class Example1_4 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. Выводим на печать "0"
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" ); // эта часть не выполняется
        }catch (Exception e) {
            System.out.println("2" ); // исключение обработано, выводим на печать "2"
        }catch (Error e) {
            System.out.println("3" ); // эта часть не выполняется
        }
        System.out.println("4"); // 3. Выводим на печать "3"
    }
}
