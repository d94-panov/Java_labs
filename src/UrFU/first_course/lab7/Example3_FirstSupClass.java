package UrFU.first_course.lab7;

public class Example3_FirstSupClass {
    public int int1; // В первом суперклассе есть открытое целочисленное поле

    public void setInt1(int int1) { // метод с одним параметром для присваивания значения полю
        this.int1 = int1;
    }

    Example3_FirstSupClass(int int1) { // конструктор с одним параметром
        this.setInt1(int1);
    }

    // Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + "int1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }

    public int getInt1() {
        return int1;
    }
}
