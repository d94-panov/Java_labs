package UrFU.first_course.lectures.lecture6;

public class Instanceof_Main {
    public static void main(String[] args) {
        Instanceof_Person nikolay = new Instanceof_Person("Nikolay");
        nikolay.display();
        Instanceof_Person petr = new Instanceof_Employee("Petr", "Mail");
        petr.display();
        System.out.println(petr instanceof Instanceof_Person);
        System.out.println(petr instanceof Object);
        //System.out.println(petr instanceof Instanceof_Car);
    }
}
