package UrFU.first_course.lab7;

public class Example5_FirstSupClass { // суперкласс с защищенным тестовым полем
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    Example5_FirstSupClass(String str1) { // конструктор с текстовым параметром
        this.setStr1(str1);
    }

    public void PrintToString() { // метод, при вызове которого в консольном окне отображается название класса и значение поля
        String ClassNameAndFieldValue = "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                "String1 = \"" + this.getStr1() + "\"";
        System.out.println(ClassNameAndFieldValue);
    }

    public String getStr1() {
        return str1;
    }
}
