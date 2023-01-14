package UrFU.first_course.lab6;

//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним , второй — с предпоследним и так далее.

public class Example9 {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        Lab9.rCharArray(ch);
        Lab9.viewReverseChArray();
    }

    private static class Lab9 {
        private static char[] reverseCharArray;

        private static char[] rCharArray(char chArray[]) { // статический методом, аргументом которому передастся символьный массив
            char changeChar;
            int l = chArray.length - 1;
            reverseCharArray = new char[chArray.length];
            for (int i = 0; i < chArray.length; i++) {
                changeChar = chArray[i];
                reverseCharArray[i] = chArray[l - i];
                reverseCharArray[l - i] = changeChar;
            }
            return reverseCharArray;
        }

        private static void viewReverseChArray() {
            for (int i = 0; i < reverseCharArray.length; i++) {
                System.out.println("reverseCharArray[" + i + "] = " + reverseCharArray[i]);
            }
        }
    }
}
