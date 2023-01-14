package UrFU.first_course.lab6;

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.

public class Example7 {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        Lab7.convertCharArray(ch);
        Lab7.viewArray();
    }

    private static class Lab7 {
        static int[] intArray;

        private static int[] convertCharArray(char chArray[]) { // статический методом, аргументом которому передастся символьный массив
            intArray = new int[chArray.length];
            for (int i = 0; i < chArray.length; i++) {
                intArray[i] = (int) chArray[i];
            }
            return intArray; // результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
        }

        private static void viewArray() {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("inArray[" + i + "] = " + intArray[i]);
            }
        }
    }
}
