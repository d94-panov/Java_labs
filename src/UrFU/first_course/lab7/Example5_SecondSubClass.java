package UrFU.first_course.lab7;

public class Example5_SecondSubClass extends Example5_FirstSupClass { // на основе суперкласса создается подкласс
    protected char char1; // защищенное символьное поле

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    Example5_SecondSubClass(String str1, char char1) { // конструктор с двумя параметрами
        super(str1);
        this.setChar1(char1);
    }

    @Override // переопределен метод для отображения значений полей объекта и названия класса
    public void PrintToString() {
        String SecondFiledValue = "char1 = \"" + this.getChar1() + "\"";
        super.PrintToString();
        System.out.println(SecondFiledValue);
    }

    public char getChar1() {
        return char1;
    }
}
