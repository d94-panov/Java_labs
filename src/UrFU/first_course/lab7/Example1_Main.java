package UrFU.first_course.lab7;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.

public class Example1_Main {
    public static void main(String[] args) {
        Example1_superClassTest superClassObject = new Example1_superClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        Example1_subClassTest subClassObject1 = new Example1_subClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        Example1_subClassTest subClassObject2 = new Example1_subClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
