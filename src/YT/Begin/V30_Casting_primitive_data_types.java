package YT.Begin;

public class V30_Casting_primitive_data_types {
    public static void main(String[] args) {
//        int x1 = 23;
//        short x2 = 123;
//        byte x = 123; // -128 до 127
//        long y = 123123123153L;
//        double a = 12.3;
//        float g = 12.2f;

        float f = 123.2f;
        float f1 = (float) 123.2;

        int i = 123;
        long l = i; // неявное приведение типов
        int y = (int)l; // явное приведение типов
        System.out.println(y);

        int a = 123;
        double x = a;
        System.out.println(x);

        long l1 = Math.round(x);
        System.out.println(l1);
    }
}
