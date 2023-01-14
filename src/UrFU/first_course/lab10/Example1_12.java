package UrFU.first_course.lab10;

public class Example1_12 {
    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно"); // 2. в метод передан null, поэтому исключение не перехвачено и появляется ошибка
        }
        if (chislo>0.001) { // эта часть не выполняется из-за ошибки IllegalArgumentException
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args) {
        m(null,0.000001); // 1. В метод передаем арнументы null и 0.000001
    }
}
