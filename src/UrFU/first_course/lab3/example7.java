package UrFU.first_course.lab3;

import java.util.Arrays;

public class example7 {
    public static void main(String[] args) {
        int size = 10;
        char chars[] = new char[size];
        char i = 'a';
        for (int x = 0; x < size; i++) {
            if (i % 2 == 1) {
                chars[x] = i;
                System.out.println("Массив в прямом порядке " + chars[x]);
                x++;
            }
        }
        System.out.println();
        Arrays.parallelSort(chars);
        for (int x = 0; x < size; i--) {
            if (i % 2 == 1) {
                chars[x] = i;
                System.out.println("Массив в обратном порядке " + chars[x]);
                x++;
            }
        }
    }
}
