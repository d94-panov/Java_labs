package UrFU.first_course.lab12;

//Выполнить чтение из одного файла и запись в другой
//файл с использованием класса PrintWriter.

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
// Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab12\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab12\\MyFile2.txt", "cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
