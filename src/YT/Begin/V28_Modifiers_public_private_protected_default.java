package YT.Begin;

import YT.Begin.V28_Packet1.Person;

public class V28_Modifiers_public_private_protected_default { // публичный класс
    public int id; // публичное поле
    int id2; // дефолтное поле
    protected int id3;

    public static void main(String[] args) { // публичный метод
        // public разрешает доступ к классу, методу, полю в одном проекте
        // private доступ только в том классе, в котором задекларировано
        // default по умлочению, если не указываем никакой модификатор доступа. Все что default доступно в пределах этого пакета
        // protected доступны в переделах одного пакета, доступны всем подклассам, даже если подклассы вне пакета где поля или методы декларированы
        // класс может быть public или default. класс не может быть private или protected
        // в одном java файле не может быть двух публичных классов

        Person person1 = new Person();
        person1.name = "Bob"; // получаем доступ к name из другого пакета

        System.out.println(Person.CONSTANT); // получаем доступ к константе
    }

    private void technicalMethod() { // приватный метод

    }
}

class Test2{ // непубличный класс

}
