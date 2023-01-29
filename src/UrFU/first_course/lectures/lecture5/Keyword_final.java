package UrFU.first_course.lectures.lecture5;

public class Keyword_final {
    public final String MY_VARIABLE_1 = "Variable Initialized"; // константы пишутся заглавными буквами, слова отделяются _
    public final static String MY_VARIABLE_2;
    public final String MY_VARIABLE_3;
    public final String MY_VARIABLE_4;

    static { // статический блок инициализации
        MY_VARIABLE_2 = "Static Variable Initialized";
    }

    {
        MY_VARIABLE_3 = "block Initialized"; // инциализация в блоке кода
    }

    public Keyword_final() { // конструктор
        MY_VARIABLE_4 = "Constructor Initialized";
    }
}
