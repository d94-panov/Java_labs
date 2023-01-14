package UrFU.first_course.lab3;

import java.util.Scanner;

public class example3_for {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажи количество чисел");
        int num = scanner.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for(int i = 3; i <= num; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
