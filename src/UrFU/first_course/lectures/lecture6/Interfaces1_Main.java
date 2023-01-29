package UrFU.first_course.lectures.lecture6;

public class Interfaces1_Main {
    public static void main(String[] args) {
        Interfaces1_Printable book = new Interfaces1_Book("Java", "Shildt");
        book.print();
        book.shoeInfo();

        Interfaces1_Printable.read();
    }
}
