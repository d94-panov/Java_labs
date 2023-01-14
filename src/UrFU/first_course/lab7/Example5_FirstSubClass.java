package UrFU.first_course.lab7;

public class Example5_FirstSubClass extends Example5_FirstSupClass { // на основе суперкласса создается подкласс
    protected int int1; // защищенное целочисленное поле

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    Example5_FirstSubClass(String str1, int int1) { // конструктор с двумя параметрами
        super(str1);
        this.setInt1(int1);
    }

    @Override // переопределение метода для отображения значений полей объекта и названия класса
    public void PrintToString() {
        String SecondFieldValue = "int1 = \"" + this.getInt1() + "\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }

    public int getInt1() {
        return int1;
    }
}
