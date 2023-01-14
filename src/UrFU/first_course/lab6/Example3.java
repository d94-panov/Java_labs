package UrFU.first_course.lab6;

//Напишите программу с классом, в котором есть статические методы,
//которым можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив).
//Методы, на основании переданных аргументов или массива,позволяют вычислить:
//наибольшее значение,
//наименьшее значение,
//а также среднее значение из набора чисел.

public class Example3 {
    public static void main(String[] args) {
        Example3.calcMax(5, -9, 0, 18, -12, 3);
        Example3.calcMin(-6, 1, 0, 15, 7);
        Example3.calcAvg(0, 5, 9, -6, 8, 12, 3);
    }

    // наибольшее значение
    private static void calcMax(int... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Наибольшее значение = " + max);
    }

    // наименьшее значение
    private static void calcMin(int... array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Наименьшее значение = " + min);
    }

    // среднее значение
    private static void calcAvg(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        double avg = (double) sum / array.length;
        System.out.println("Среднее значение = " + avg);
    }
}
