package UrFU.first_course.lab7;

//Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса. Во
//втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//метод через объектную переменную суперкласса, которая ссылается на объект производного класса.

public class Example5_Main {
    public static void main(String[] args) {
        Example5_FirstSupClass SuperClassTest1 = new Example5_FirstSupClass("test this");
        SuperClassTest1.PrintToString();

        Example5_FirstSubClass SubClassTest1 = new Example5_FirstSubClass("test", 256);
        SubClassTest1.PrintToString();

        Example5_SecondSubClass SubClassTest2 = new Example5_SecondSubClass("test", 'A');
        SubClassTest2.PrintToString();

        Example5_FirstSupClass SuperClassTest2 = new Example5_FirstSupClass(SubClassTest1.getStr1());
        SubClassTest2.PrintToString();

        Example5_FirstSupClass SuperClassTest3 = new Example5_FirstSupClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
