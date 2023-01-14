package UrFU.first_course.lab7;

public class Example3_SecondSubClass extends Example3_FirstSupClass { // на основе суперкласса создается подкласс
    Example3_SecondSubClass(int int1) {
        super(int1);
    }

    public char char1; // Во втором классе появляется открытое символьное поле

    public void setInt1Str1(int int1, char char1) { // метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
        super.int1 = int1;
        this.char1 = char1;
    }

    Example3_SecondSubClass(int int1, char char1) { // конструктор с двумя параметрами
        super(int1);
        this.setInt1Str1(int1, char1);
    }

    public String toString() {
        String SecondFieldValue = "\n str1 = " + this.getChar1();
        return super.toString() + SecondFieldValue;
    }

    public char getChar1() {
        return char1;
    }
}
