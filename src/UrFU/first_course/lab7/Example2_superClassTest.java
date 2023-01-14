package UrFU.first_course.lab7;

public class Example2_superClassTest {
    private String str1; // с приватным текстовым полем

    Example2_superClassTest() {
        setStr1();
    }

    Example2_superClassTest(String str1) { // Объект суперкласса создается передачей одного текстового аргумента конструктору
        setStr1(str1);
    }

    public void setStr1 () { // метод для присваивания значения полю без параметров
        this.str1 = "тут ничего нет";
    }

    public void setStr1(String str1) { // метод для присваивания значения полю с одним текстовым параметром
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public int getStr1length() { // Доступное только для чтения свойство результатом возвращает длину текстовой строки
        return str1.length();
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1()
                + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}
