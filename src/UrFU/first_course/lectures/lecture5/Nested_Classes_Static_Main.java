package UrFU.first_course.lectures.lecture5;

public class Nested_Classes_Static_Main {
    public static void main(String[] args) {
        Nested_Classes_Static_Outer.Nested nested = new Nested_Classes_Static_Outer.Nested(); // внешний класс -> статический внутренний класс
        nested.showInfo();
    }
}
