package UrFU.first_course.lab7;

//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания
//копии.

public class Example4_Main {
    public static void main(String[] args) {
        // super Class test
        Example4_FirstSupClass superClassTest = new Example4_FirstSupClass('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);

        // super Class test copy
        Example4_FirstSupClass superClassTestCopy = new Example4_FirstSupClass(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);

        // 1 subClass test
        Example4_SecondSubClass FirstSubClassTest = new Example4_SecondSubClass('A', "text");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        // 1 subClass test copy
        Example4_SecondSubClass FirstSubClassTestCopy = new Example4_SecondSubClass(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);

        // 2 sub Class test
        Example4_ThirdSubClass SecondSubClassTest = new Example4_ThirdSubClass('A', "text", 512);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);

        // 2 subClass test copy
        Example4_ThirdSubClass SecondSubClassTestCopy = new Example4_ThirdSubClass(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
