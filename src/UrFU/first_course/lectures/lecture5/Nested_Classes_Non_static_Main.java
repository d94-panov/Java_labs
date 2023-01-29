package UrFU.first_course.lectures.lecture5;

public class Nested_Classes_Non_static_Main {
    public static void main(String[] args) {
        Nested_Classes_Non_static_Outer outer = new Nested_Classes_Non_static_Outer(); // создаем объект класса
        outer.showInner(); // вызываем метод showInner

        outer.showLocal();
    }
}
