package UrFU.first_course.lab7;

public class Example4_SecondSubClass extends Example4_FirstSupClass { // на основе суперкласса создается подкласс
    Example4_SecondSubClass(char char1) {
        super(char1);
    }

    public String str1; // Во втором классе появляется открытое текстовое поле

    public void setChar1Str1(char char1, String str1) {
        super.char1 = char1;
        this.str1 = str1;
    }

    Example4_SecondSubClass(char char1, String str1) { // оригинальный конструктор
        super(char1);
        this.setChar1Str1(char1, str1);
    }

    Example4_SecondSubClass(Example4_SecondSubClass copy) { // конструктор копии
        super(copy.char1);
        this.setChar1Str1(copy.char1, copy.str1);
    }

    @Override
    public String toString() {
        String SecondFieldValue = "\n str1 = " + this.getStr1();
        return super.toString() + SecondFieldValue;
    }

    public String getStr1() {
        return str1;
    }
}
