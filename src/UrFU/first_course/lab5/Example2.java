package UrFU.first_course.lab5;

//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.

public class Example2 {
    public static void main(String[] args) {
        CharField charField = new CharField();
        charField.Setch('A', 'D');
        charField.showCharArray();
    }
}

class CharField { // класс с двумя символьнами полями
    private char ch1;
    private char ch2;

    public void Setch(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void showCharArray() { // метод возвращает результат и у него нет аргументов

        // При вызове метод выводит в консольное окно все символы из кодовой таблицы,
        // которые находятся «между» символами, являющимися значениями полей объекта (из которого вызывается метод):
        int int1 = ch1;
        int int2 = ch2;
        if (ch1 > ch2) {
            int1 = ch2;
            int2 = ch1;
        }
        int schet = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(schet + " symbol = " + (char) i);
            schet++;
        }
    }
}
