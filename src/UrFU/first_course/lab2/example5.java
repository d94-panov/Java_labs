package UrFU.first_course.lab2;

import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");

        if (con.hasNextInt()) {

        long n = con.nextLong();

        if (n < 0) n = -n;

        while(n > 9)
            n /= 10;

        System.out.printf("В указанном числе %d тысяч", n);

        con.close();

        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова");
        }

    }
}