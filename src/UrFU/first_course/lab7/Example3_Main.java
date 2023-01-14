package UrFU.first_course.lab7;

//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта.

public class Example3_Main {
    public static void main(String[] args) {
        Example3_FirstSupClass superClassTest = new Example3_FirstSupClass(512);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        Example3_SecondSubClass FirstSupClassTest = new Example3_SecondSubClass(1024, 'K');
        String className2 = FirstSupClassTest.toString();
        System.out.println(className2);

        Example3_ThirdSubClass SecondClassTest = new Example3_ThirdSubClass(1024, 'K', "ыва");
        String className3 = SecondClassTest.toString();
        System.out.println(className3);
    }
}
