package UrFU.first_course.lab11;

//Чтение из одного файла и запись в другой файл дан-
//ных построчно с использованием буфера в 1 килобайт.

import java.io.*;

public class Example1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("src\\UrFU\\first_course\\lab11\\MyFile1.txt"), 1024); // 1024 - размер буфера
            out = new BufferedWriter(new FileWriter("src\\UrFU\\first_course\\lab11\\MyFile2.txt"));
            int lineCount = 0; //счетчик строк
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
