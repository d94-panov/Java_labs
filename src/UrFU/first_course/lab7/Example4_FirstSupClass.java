package UrFU.first_course.lab7;

public class Example4_FirstSupClass {
    public char char1; // В первом классе есть открытое символьное поле

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    Example4_FirstSupClass(char char1) { // конструктор с одним параметром
        this.setChar1(char1);
    }

    Example4_FirstSupClass(Example4_FirstSupClass copy) { // конструктор копии
        this.setChar1(copy.char1);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + "char1 = " + this.getChar1();
        return ClassNameAndFieldValue;
    }

    public char getChar1() {
        return char1;
    }
}
