package UrFU.first_course.lectures.lecture1;

import java.util.Scanner;

public class class_String {
    public static void main(String[] args) {
        String str1;
        str1 = "Эта строка";
        String str2 = "И это строка";
        // Конкатенация строк
        String str3 = str1 + str2 + "!!!";
        String str4 = new String("Еще строка");

        // Длина строки
        String s = "Я стану программистом";
        int len = s.length();
        System.out.println("Длина строки: " + len + " символ.");
        System.out.println();

        // Сложение - конкатенация строк
        String string1 = "отличным ";
        System.out.println("Я стану " + string1 + "программистом");
        System.out.println();

        // Сравнение строк
        Scanner in = new Scanner(System.in);
        System.out.print("Введи Привет ");
        String string2 = in.nextLine();
        String string3 = "Привет";
        boolean result = string2.equals(string3);
        System.out.println(result);

        // Поиск символа
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введи что-то содержащее + ");
        String string4 = in.nextLine();
        if (string4.contains("+")){
            System.out.println("Строка содержит +");
        } else {
            System.out.println("Строка не содержит +");
        }
        System.out.println();

        // Разбиение строки на массив строк
        System.out.println("Разбиение строки на массив строк:");
        String people = "Иванов Иван Иванович; " +
                "Петров Петр Петрович; " +
                "Сидоров Сидр Сидорович";
        String[] peopleArray = people.split("; "); // split по указанному сиволу ";" разбивает строку на подстроки
        for (String human : peopleArray){
            System.out.println(human);
        }
        System.out.println();

        // Определение позиции элемента в строке
        System.out.println("Определение позиции элемента в строке:");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('C')); // indexOf возвращает место символа в строке
        System.out.println(alphabet.indexOf('D')); // Если символа нет, то вернется значение "-1"
        System.out.println(alphabet.indexOf('P')); // 15
        System.out.println();

        // Извлечение подстроки из строки
        System.out.println("Извлечение подстроки из строки:");
        String filePath = "C:\\Music\\Song.mp3";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName);
        System.out.println();

        // Перевод строки в верхний/нижний регистр
        System.out.println("Перевод строки в верхний/нижний регистр:");
        String name = "Иванов Иван Иванович";
        String lowerCaseName = name.toLowerCase();
        String upperCaseName = name.toUpperCase();
        System.out.println(lowerCaseName); // иванов иван иванович
        System.out.println(upperCaseName); // ИВАНОВ ИВАН ИВАНОВИЧ
    }
}
