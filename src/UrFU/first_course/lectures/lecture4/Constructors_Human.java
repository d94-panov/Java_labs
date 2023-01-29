package UrFU.first_course.lectures.lecture4;

public class Constructors_Human {
    String name;
    String surname;
    int age;

    public Constructors_Human() {
    }

    public Constructors_Human(String surname) {
        this.surname = surname;
    }

    public Constructors_Human(int age) {
        this.age = age;
    }

    public Constructors_Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Constructors_Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
