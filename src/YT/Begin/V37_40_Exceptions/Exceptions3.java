package YT.Begin.V37_40_Exceptions;

public class Exceptions3 {
    public static void main(String[] args) {
        // сключения делятся на:
        // Checked Exception - возникают во время компиляции = исключительные случаи в работе программы
        // Unchecked - возникают во время выполнения программы = ошибка в работе программы

//        File file = new File("test");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("fail");
//        }

//        int a = 1 / 0; // Unchecked

//        String name = null; // Unchecked
//        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
