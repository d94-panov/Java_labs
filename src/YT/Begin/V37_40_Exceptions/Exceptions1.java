package YT.Begin.V37_40_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) { //throws FileNotFoundException//
//        File file = new File("test");
//
//        Scanner scanner;
//
//    {
//        try {
//            scanner = new Scanner(file);
//            System.out.println("После scanner'а"); // если появляется ошибка, то код внутри блока не выполняется
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//
//        System.out.println("После блока try catch");
//    }

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }

public static void readFile() throws FileNotFoundException {
        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
}
}
