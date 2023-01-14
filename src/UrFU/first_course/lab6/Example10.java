package UrFU.first_course.lab6;

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.

public class Example10 {
    public static void main(String[] args) {
        Lab10 myex1 = new Lab10();
        Lab10 myex2 = new Lab10();
        myex1.calcMaxMin(-5, 0, 1, 9, -9, 7);
        myex1.viewMaxMin();
        Lab10.calcMaxMin(6, 0, -8, 5, 3);
        Lab10.viewMaxMin();
        myex2.calcMaxMin(26, 124, -2, -8, 5);
        myex2.viewMaxMin();
    }

    protected static class Lab10 {
        private static int[] maxMin;

        private static int[] calcMaxMin(int... array) { // методу аргументом передается произвольное количество целочисленных аргументов
            int max = array[0];
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            maxMin = new int[]{max, min};
            return maxMin; // Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу
        }

        private static void viewMaxMin() {
            System.out.println("\nmaxiMin[max] = " + maxMin[0]);
            System.out.println("maxiMin[min] = " + maxMin[1]);
        }
    }
}
