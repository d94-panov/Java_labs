package YT.Begin;

public class V4_While {
    public static void main(String[] args) {
        int value = 0;
        while (value < 5) { // выполняется до тех пор, пока заданное условние дает значение тру
            System.out.println("Hello"+ value);
            value = value + 1;
        }
    }
}