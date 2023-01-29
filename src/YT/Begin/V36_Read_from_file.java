package YT.Begin;

import UrFU.first_course.lectures.lecture6.Inheritance_Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class V36_Read_from_file {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // делаем разделитель универсальным
        String path = separator + "C:" + separator + "Users" + separator + "dpabe" + separator + "OneDrive" + separator + "Рабочий стол" + separator + "Test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextInt()) { // hasNextInt возвращает строки, пока они не закончились
//            System.out.println(scanner.nextLine());
//        }

        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); // split показываем чем разделяем значения. в случае "1 2 3" разделитель пробел
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number); // parseInt принимает строку и преобразует в число
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}

// separator + "C:" + separator + "Users" + separator + "dpabe" + separator + "OneDrive" + separator + "Рабочий стол" + separator + "Test.txt"
// "C:\Users\dpabe\OneDrive\Рабочий стол\Test.txt"