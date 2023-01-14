package UrFU.first_course.lab10;

public class Example1_3 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // 1. выводим "0"
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" ); // эта часть не выполняется
        }catch (RuntimeException e) {
            System.out.println("2" ); // 2. исключение обработано, выводим на печать "2"
        }catch (Exception e) {
            System.out.println("3" ); // исключение обработано ранее, поэтому эта часть не выполняется
        }
        System.out.println("4"); // 3. Выводим на печать "4"
    }
}
