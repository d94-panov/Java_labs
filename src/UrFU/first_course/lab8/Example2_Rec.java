package UrFU.first_course.lab8;

public class Example2_Rec {
    private static int x;
    private static String result = "";

    Example2_Rec(int x) {
        this.x = x;
        System.out.println(IntToBin(x));
    }

    protected String IntToBin(int x) {
        int i = x;
        if (i < 0) { // обработка отрицательных значений
            i = -i;
        }

        if (i != 0) { // перевод в двоичную систему
            IntToBin(i / 2);
            result = result + i % 2;
        }
        return "Число в двоичной системе = " + result;
    }
}
