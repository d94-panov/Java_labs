package UrFU.first_course.lab4;

public class example2 {
    public static void main(String[] args) {
        int x = 10;
        int z = 0;
        for (int i = 1; i <= x; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
