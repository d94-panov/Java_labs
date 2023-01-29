package YT.Begin;

import java.util.Scanner;
public class V7_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt(); // nextLine строка продолжается пока не нажмем ентер
        System.out.println("вы ввели "+x);
    }
}
