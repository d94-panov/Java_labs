package UrFU.first_course.lectures.lecture6;

public class Inheritance_Person {
    private String name;

    public Inheritance_Person(String name) {
        this.name = name;
    } // конструктор

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("name = " + name);
    }
}
