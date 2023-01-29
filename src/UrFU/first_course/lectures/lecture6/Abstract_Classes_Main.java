package UrFU.first_course.lectures.lecture6;

public class Abstract_Classes_Main {
    public static void main(String[] args) {
        Abstract_Classes_Employee nikolay = new Abstract_Classes_Employee("Nikolay", "VK");
        nikolay.display();
        Client petr = new Client("Petr", "VK");
        petr.display();
    }
}
