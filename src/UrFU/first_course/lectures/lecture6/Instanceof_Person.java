package UrFU.first_course.lectures.lecture6;

public class Instanceof_Person {
    String name;

    public String getName() {
        return name;
    }

    public Instanceof_Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Person " + name);
    }
}
