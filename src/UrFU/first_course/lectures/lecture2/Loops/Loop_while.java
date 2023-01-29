package UrFU.first_course.lectures.lecture2.Loops;

import java.util.Scanner;

public class Loop_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int size = in.nextInt();
        while (count < size) {
            System.out.println("count < 10, count" + count);
            count++;
        }
    }
}
