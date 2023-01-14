package UrFU.first_course.lab7;

public class Example3_ThirdSubClass extends Example3_SecondSubClass { // на основе этого подкласса создается еще один подкласс
    Example3_ThirdSubClass(int int1) {
        super(int1);
    }

    public String str2; // В третьем классе появляется открытое текстовое ноле

    public void setInt1Str1Str2(int int1, char char1, String str2) { // метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }

    Example3_ThirdSubClass(int int1, char char1, String str2) { // конструктор с тремя параметрами
        super(int1, char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String ThirdFieldValue = "\n str2 = " + this.getStr2();
        return super.toString() + ThirdFieldValue;
    }

    public String getStr2() {
        return str2;
    }
}
