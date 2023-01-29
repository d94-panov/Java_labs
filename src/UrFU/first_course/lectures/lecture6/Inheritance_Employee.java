package UrFU.first_course.lectures.lecture6;

public class Inheritance_Employee extends Inheritance_Person { // от класса Employee может наследоваться только класс Person
    int age;
    public Inheritance_Employee(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("name + " + getName() + " age " + age);
        super.display();
    }
}
