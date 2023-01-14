package UrFU.first_course.lab11;

//Создать проект, позволяющий из одного текстового файла,
//содержащего несколько строк (тип String) заранее подготовленного текста
//на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//Ваш вкус), построчно переписать в другой текстовый файл слова
//начинающиеся с согласных букв..
//Требования:
//– слова из предложения выделять методом split();
//– в новом файле следует указать номер строки, в которой иско- мые
//слова находились в исходном файле;
//– для каждой строки указать количество выбранных слов.

import java.io.*;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src\\UrFU\\first_course\\lab11\\File1.txt")));
            printWriter = new PrintWriter("src\\UrFU\\first_course\\lab11\\File2.txt");
            int line = 0;
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                line++;
                String[] array = str.split(" ");
                int row = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i].matches("(?ui:[^ауоыэяюёие]).*")) {
                        printWriter.print(array[i] + " ");
                        row++;
                    }
                }
                printWriter.println("\n Кол-во слов в строке: " + row);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
        }
    }
}
