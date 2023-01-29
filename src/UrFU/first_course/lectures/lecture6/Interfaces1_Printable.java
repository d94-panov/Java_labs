package UrFU.first_course.lectures.lecture6;

public interface Interfaces1_Printable {
    void print();
    default void shoeInfo() {
        System.out.println("Дефолтный метод");
    }

    static void read() {
        System.out.println("читаю");
    }


}
