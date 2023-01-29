package YT.Begin;

public class V49_Recursion {
    public static void main(String[] args) {
//        counter(3);

        // 4! = 4 * 3 * 2 * 1
        System.out.println(fac(4));
    }

//    private static void counter(int n) {
//
//        if (n == 0) {
//            return;
//        }
//
//        System.out.println(n);
//
//        counter(n - 1);
//    }

    private static int fac(int n) {
        if(n == 1)
            return 1;

        return n * fac(n - 1);
    }
}
