package UrFU.first_course.lectures.lecture6;

public class Inheritance_Main {
    public static void main(String[] args) {
        Inheritance_Person person1 = new Inheritance_Person("Иван");
        person1.display();

//        Inheritance_Employee employee1 = new Inheritance_Employee("Николай");
//        employee1.display();
//        employee1.setName("Петр");
//        employee1.display();

        Inheritance_Person person2 = new Inheritance_Employee("Василий");
        person2.display();
    }
}
