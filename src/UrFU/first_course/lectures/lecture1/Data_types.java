package UrFU.first_course.lectures.lecture1;

public class Data_types {
    public static void main(String[] args) {
        // Integral type
        byte aByte = 1; // Целые числа в диапазоне от -128 до 127
        short aShort = 1; // Целые числа в диапазоне от -32 768 до 32767
        int anInt = 1; // Целые числа в диапазоне от -2147483648 до 2147483647
        long aLong = 1; // Целые числа в диапазоне от -9223372036845775808 до 9223372036845775807
        char aChar = 'a'; // Тип для представления символьных значений
                          // Реализуются символы с кодами от 0 до 65 536

        // Floating Point Type (тип с плавающей запятой)
        double aDouble = 0.2; // Действительные числа (двойной точность).
                              // Минимальный шаг дискретности (точность)
                              // составляет величину 1,7 * 10-308,
                              // максимальное значение (по модулю) - 1,7 * 10308
        float aFloat = 0.2f; // Действительные числа (двойной точности).
                              // Минимальный шаг дискретности (точность)
                              // составляет величину 3,4 * 10-308,
                              // максимальное значение (по модулю) - 3,4 * 10308

        // Boolean. Логический тип данных. Принимает значение true или false
        boolean aBoolean = true;
        boolean isaBoolean = false;
    }
}