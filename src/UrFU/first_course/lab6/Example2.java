package UrFU.first_course.lab6;

//Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым значением.
//В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля,
//после чего значение поля увеличивается на единицу.

public class Example2 {
    public static void main(String[] args) {
        Example myex = new Example();
        myex.look();
        myex.look();
        myex.look();
    }

    public static class Example {
        private static int value; // закрытое статическое целочисленное ноле с начальным нулевым значением

        public static void look() {
            System.out.println(value); // статический метод, при вызове которого отображается текущее значение статического поля
            value++; // после чего значение поля увеличивается на единицу
        }
    }
}
