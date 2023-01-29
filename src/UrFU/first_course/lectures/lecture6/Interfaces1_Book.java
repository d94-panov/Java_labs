package UrFU.first_course.lectures.lecture6;

public class Interfaces1_Book implements Interfaces1_Printable {
    String name;
    String author;

    public Interfaces1_Book(String name, String author) { // конструктор
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("name " + this.name + " author " + this.author);
    }
}
