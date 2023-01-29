package YT.Begin;

public class V23_StringBuilder {
    public static void main(String[] args) {
//        String x = "hello";
//        x = x.toUpperCase();
//        System.out.println(x);

//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1 + string2 + string3;
//        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
//        sb.append(" my");
//        sb.append(" friend");
//        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

        // Форматирование строк
        System.out.printf("This is a string, %s \n", "NICE"); // % - тип вставляемого значения
        System.out.printf("%fThis is %s a string, %d \n", 10.4, "HIHI", 10000); // \n переносит на следующую строку
        System.out.printf("String %-10d \n", 532); // если поставить "-", то число будет слева, без него справа
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);

        System.out.printf("String %.2f \n", 45.32265); // .2 значит будет два числа после запятой и округляется
        System.out.printf("String %.2f \n", 45.32);
        System.out.printf("String %.2f \n", 45.33754);
        System.out.printf("String %.2f \n", 45.326525845);
        System.out.printf("String %.2f \n", 45.337);
    }
}
