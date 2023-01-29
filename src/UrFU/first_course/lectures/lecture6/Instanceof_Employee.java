package UrFU.first_course.lectures.lecture6;

public class Instanceof_Employee extends Instanceof_Person {
    String company;

    public Instanceof_Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.println("Employee " + super.getName() + " works in " + company);
    }
}
