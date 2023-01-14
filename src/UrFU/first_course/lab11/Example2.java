package UrFU.first_course.lab11;

//Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа.

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\File1.txt"), "cp1251"));
            printWriter = new PrintWriter("C:\\Users\\dpabe\\IdeaProjects\\untitled\\src\\UrFU\\first_course\\lab11\\File2.txt", "cp1251");
            int line = 0;
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                line++;
                if (line == 2) {
                    printWriter.println(line + ": " + str);
                }
                for (int i = 0; i < str.split(" ").length; i++) {
                    if (isNumber(str.split(" ")[i])) {
                        double d = Double.parseDouble(str.split(" ")[i]);
                        if (d >= 0) {
                            printWriter.println(i + ": " + d);
                            System.out.println(i + ": " + d);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
        }
    }

    public static boolean isNumber(String str) {
        try {
            double i = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
