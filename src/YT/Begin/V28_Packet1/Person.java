package YT.Begin.V28_Packet1;

public class Person {
    public String name; // публичное поле
    // поля не желательно делать публичными (см Инкапсуляция)

    public final static String CONSTANT = "CONSTANT";
    // константы можно делать публичными, т.к. их нельзя изменить

    protected String name2;
    public Person() { // конструктор
        name2 = "Bob";
    }
}
