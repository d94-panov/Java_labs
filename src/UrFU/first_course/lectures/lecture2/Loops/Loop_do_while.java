package UrFU.first_course.lectures.lecture2.Loops;

import java.util.Scanner;

public class Loop_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 10, size = in.nextInt();
        do {
            System.out.println("Будет напечатано обязательно 1 раз");
            count++;
        }
        while (count < size);
    }
}
