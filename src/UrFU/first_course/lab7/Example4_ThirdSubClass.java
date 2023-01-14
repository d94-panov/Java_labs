package UrFU.first_course.lab7;

public class Example4_ThirdSubClass extends Example4_SecondSubClass { // на основе подкласса создается езе одни подкласс
    Example4_ThirdSubClass(char char1) {
        super(char1);
    }

    public int int1; // В третьем классе появляется открытое целочисленное поле

    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }

    Example4_ThirdSubClass(char char1, String str1, int int1) { // оригинальный конструктор
        super(char1, str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }

    Example4_ThirdSubClass(Example4_ThirdSubClass copy) { // конструктор копии
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }

    public String toString() {
        String ThirdFieldValue = "\n str2 = " + this.getInt1();
        return super.toString() + ThirdFieldValue;
    }

    public int getInt1() {
        return int1;
    }
}
