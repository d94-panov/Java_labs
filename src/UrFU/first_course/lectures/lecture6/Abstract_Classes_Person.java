package UrFU.first_course.lectures.lecture6;

public abstract class Abstract_Classes_Person {
    private String name;

    public String getName() {
        return name;
    }

    public Abstract_Classes_Person(String name) {
        this.name = name;
    }

    public abstract void display();
}
