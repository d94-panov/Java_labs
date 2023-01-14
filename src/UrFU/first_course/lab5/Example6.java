package UrFU.first_course.lab5;

//Напишите программу с классом, в котором есть два закрытых
//целочисленных поля (назовем их max и min).
//Значение поля max не может быть меньше значения поля min.
//Значения полям присваиваются с помощью открытого метода.
//Метод может вызываться с одним или двумя целочисленными аргументами.
//При вызове метода значения полям присваиваются так:
//сравниваются текущие значения полей и значения аргументов, переданных методу.
//Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается
//полю min.
//Предусмотрите конструктор, который работает по тому же принципу, что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.

public class Example6 {
    public static void main(String[] args) {
        Example myexample = new Example(2, 5); // конструктор с двумя аргументами
        myexample.PrintInt();

        Example myexample1 = new Example(1); // конструктор с одним аргументом
        myexample1.PrintInt();

        myexample.SetInt(3, 15); // метод с двумя агрументами
        myexample.PrintInt();

        myexample.SetInt(-9); // метод с одним аргументом
        myexample.PrintInt();
    }

    static class Example {
        private static int min;
        private static int max;

        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() с двумя аргументами");
            min = Math.min(Math.min(num1, min), num2);
            max = Math.max(Math.max(num1, max), num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод SetInt() с одиним аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max - " + max);
        }

        Example(int num1, int num2) {
            System.out.println("Конструктор Example с двумя аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }

        Example(int num) {
            System.out.println("Конструктор Example с одним аргументои");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
