package UrFU.first_course.lab11;

//Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte.

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example1_2 {
    //метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) { // признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("c:/tmp/text.txt"); // Файл предварительно создан и заполнен данными
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            // С потоком связана интернет-страница
            InputStream inUrl = new URL("https://google.com/").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            // С потоком связан массив типа byte
            InputStream inArr = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4}); // массив
            readAllByByte(inArr);
            System.out.print("\n\n\n");
            inArr.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
