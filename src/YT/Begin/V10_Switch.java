package YT.Begin;

import java.util.Scanner;

public class V10_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возвраст");
        int age = scanner.nextInt();
        switch (age){ // switch может принимать переченные типа String
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("ни одно условние не подошло");
        }
    }
}
