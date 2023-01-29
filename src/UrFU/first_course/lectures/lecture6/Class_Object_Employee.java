package UrFU.first_course.lectures.lecture6;

public class Class_Object_Employee extends Class_Object_Person {
    @Override
    public void showInfo() {
        System.out.println("Я сотрудник");
    }

    @Override
    public String toString() {
        return "Класс = " + getClass() + " " + "name = " + name;
    }
}
