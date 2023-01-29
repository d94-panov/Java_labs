package UrFU.first_course.lectures.lecture3;

public class class_Math {
    public static void main(String[] args) {
        // Метод abs - вычисление значений по модулю
        System.out.println("Вычисление значений по модулю: ");
        int resultInt = Math.abs(-2);
        System.out.println("resultInt = " + resultInt); // 2

        double resultDouble = Math.abs(-32.8d);
        System.out.println("resultDouble = " + resultDouble); // 32.8

        long resultLong = Math.abs(5321L);
        System.out.println("resultLong = " + resultLong); // 5321

        float resultFloat = Math.abs(6.321f);
        System.out.println("resultFloat = " + resultFloat); // 6.321
        System.out.println();

        // Вычисление значений тригонометрических функций (синусов, косинусов и др)
        System.out.println("Вычисление значений тригонометрических функций: ");
        System.out.println(Math.sin(Math.toRadians(0))); // 0.0
        System.out.println(Math.sin(Math.toRadians(30))); // 0.49999999999999994
        System.out.println(Math.sin(Math.toRadians(90))); // 1.0

        System.out.println(Math.cos(Math.toRadians(0))); // 1.0
        System.out.println(Math.cos(Math.toRadians(30))); // 0.8660254037844387
        System.out.println(Math.cos(Math.toRadians(90))); // 6.123233995736766E-17
        System.out.println();

        // Возведение в степень
        System.out.println("Возведение в степень:");
        System.out.println(Math.pow(1, 2)); // 1.0
        System.out.println(Math.pow(2, 2)); // 4.0
        System.out.println(Math.pow(3, 2)); // 9.0
        System.out.println();

        // Извлечение корней
        System.out.println("Извлечение корней:");
        System.out.println(Math.sqrt(4)); // 2.0
        System.out.println(Math.sqrt(9)); // 3.0
        System.out.println(Math.sqrt(16)); // 4.0

        System.out.println(Math.cbrt(8)); // 2.0
        System.out.println(Math.cbrt(27)); // 3.0
        System.out.println(Math.cbrt(125)); // 5.0
        System.out.println();

        // Генерация случайных чисел
        System.out.println("Генерация случайных чисел:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random()); // будут случайные числа до 1
        }
        System.out.println();

        // Округление
        System.out.println("Округление:");
        System.out.println(Math.round(1.3)); // 1
        System.out.println(Math.round(1.5)); // 2
        System.out.println(Math.round(1.6)); // 2

        System.out.println(Math.floor(1.3)); // 1.0
        System.out.println(Math.floor(1.5)); // 1.0
        System.out.println(Math.floor(1.6)); // 1.0

        System.out.println(Math.ceil(1.3)); // 2.0
        System.out.println(Math.ceil(1.5)); // 2.0
        System.out.println(Math.ceil(1.6)); // 2.0
    }
}
