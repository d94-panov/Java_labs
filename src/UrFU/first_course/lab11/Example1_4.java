package UrFU.first_course.lab11;

//Создать первый файл на диске и записать в него заданное
//количество вещественных чисел. Далее создать второй файл и переписать в него
//все числа из первого файла.
//Программу составить в соответствии со следующим алгоритмом:
//Создать новую папку My на диске.
//В папке создать 1-й файл numIsh.txt.
//В файл записать через поток числа, вводимые с клавиатуры.
//В той же папке создать 2-й файл numRez.txt.
//Последовательно считывая числа из 1-го файла numIsh.txt,
//переписать их во второй файл numRez.txt.
//Закончить.

import java.io.*;
import java.util.Scanner;

public class Example1_4 {
    public static void main(String[] args) {
        try {
// Создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr =
                    new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();
// Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            File f2 = new
                    File("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\My\\numRez.txt");
            f2.createNewFile();
// поток для чтения из исходного файла numIsh.txt
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
// поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float) number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
