package UrFU.first_course.lab7;

public class Example2_subClassTest extends Example2_superClassTest {
    private String str2;
    public int int1; // В подклассе появляется дополнительное открытое целочисленное поле

    Example2_subClassTest() {
        setStr1();
    } // версия метода без параметров

    Example2_subClassTest(String str2) {
        setStr1(str2);
    } // версия метода с текстовым параметром

    Example2_subClassTest(int int1) { // метод с целочисленным параметром
        setStr1();
        this. setInt1(int1);
    }

    Example2_subClassTest(String str2, int int1) { // метод с текстовым и целочисленным параметром
        setStr1(str2);
        this.setInt1(int1);
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public void setStr1() {
        this.str2 = "тут ничего нет";
    }

    public void setStr1 (String str2) {
        this.str2 = str2;
    }

    public int getInt1() {
        return int1;
    }

    public String getStr1() {
        return str2;
    }

    public int getStr1length() {
        return str2.length();
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getStr1()
                + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }
}
