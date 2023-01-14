package UrFU.first_course.lab6;

public class Example1_Test {
    private char ch; // символьное поле
    private String str; // текстовое поле

    //Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю
    public void setField(char c) {
        ch = c;
        System.out.println("\n Вызов метода setField с аргументом char. ch =" + ch);
    }

    // Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля
    public void setField(String s) {
        str = s;
        System.out.println("\n Вызов метода setField с аргументом string. str =" + str);
    }

    // Если массив состоит из одного элемента, то он определяет значение символьного поля
    public void setField(char[] charArray) {
        if (charArray.length == 1) {
            ch = charArray[0];
            System.out.println("\n Вызов метода setField с массивом char. ch =" + ch);
        } else { // если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю
            str = new String(charArray);
            System.out.println("\n Вызов метода setField с массивом string. str =" + str);
        }
    }
}
