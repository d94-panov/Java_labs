package UrFU.first_course.lab2;

import java.util.Scanner;

public class training {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (con.hasNextInt()) {

        long num = con.nextLong();

        int counter = 0;
        while (num > 10) {
            num /= 10;
            counter++;
        }

            long n = counter;

            if (n < 0) n = -n;

            while (n > Math.pow(10, counter))
                n /= 10;

            System.out.printf("В указанном числе %d тысяч", n);

            con.close();

        } else {
            System.out.println("Это не число. Перезапустите программу и попробуйте снова");
        }

    }
}
