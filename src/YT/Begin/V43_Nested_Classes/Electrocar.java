package YT.Begin.V43_Nested_Classes;

public class Electrocar {
    private int id;

    // вложенный не статический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting");
        }
    }

    // статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) { // конструктор назначает поле
        this.id = id;
    }

    public void start() { // метод
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        // вложенный класс внутри метода
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " + id + " is starting");
    }

    private void test(Object object) {

    }
}
