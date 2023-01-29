package UrFU.first_course.lectures.lecture5;

public class Nested_Classes_Non_static_Outer {
    private class Inner {
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    void showInner() {
        Inner inner = new Inner(); // создается объект внутреннего класса Inner
        inner.print(); // вызывается метод print
    }

    void showLocal() { // локальный метод
        int x = 100; // локальная переменная

        class MethodLocal {
            public void print() {
                System.out.println("Метод внутреннего локального класса");
            }
        }

        MethodLocal methodLocal = new MethodLocal();
        methodLocal.print();
    }
}
