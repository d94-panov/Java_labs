package UrFU.first_course.lab8;

import java.util.Random;

public class Example3_Rec {
    Random random = new Random();
    private static int Size;
    private static int[] numbers;

    public Example3_Rec(int size) {
        Size = size;
        numbers = new int[Size];
        System.out.println("Ввод значений массива");
        setRecArray(Size);
        System.out.println("\nВывод массива");
        getRecArray(Size);
    }

    protected void setRecArray(int x) {
        int i = x - 1;
        if (x != 0) {
            setRecArray(x - 1);
            numbers[i] = random.nextInt(200);
            System.out.println(numbers[i]);
        }
    }

    protected void getRecArray(int x) {
        int j = x - 1;
        if (x != 0) {
            getRecArray(x - 1);
            System.out.println(numbers[j]);
        }
    }
}
