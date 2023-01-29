package UrFU.first_course.lectures.lecture6;

public class Class_Object {
    public static void main(String[] args) {
        Person pavel = new Person("Pavel");
        System.out.println(pavel.toString());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }
}
