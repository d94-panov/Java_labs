package UrFU.first_course.lab11;

//Чтение из одного файла и запись в другой файл дан-
//ных посимвольно.

import java.io.*;

public class Example1_6 {
    public static void main(String[] args) throws IOException { // Метод main генерирует исключение
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\MyFile1.txt"); // файл для чтения
            out = new FileWriter("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\MyFile2.txt", true); // файл для записи разрешено добавление
            // Данные считываются и записываются побайтно, как и для
// InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
// out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
