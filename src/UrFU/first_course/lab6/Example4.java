package UrFU.first_course.lab6;

//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15
//Предложите версию метода без рекурсии и с рекурсией.

public class Example4 {
    public static void main(String[] args) {
        doubleFactorial factorial = new doubleFactorial();
        int number = 8;

        System.out.println("Рекурсивный метод");
        int factorial1 = factorial.factorial1(number);
        System.out.println("Двойной факториал = " + factorial1);
        System.out.println();

        System.out.println("Метод без рекрусии");
        int factorial2 = factorial.factorial2(number);
        System.out.println("Двойной факториал = " + factorial2);
    }

    private static class doubleFactorial { // рекурсивный метод
        private int factorial1(int n) {
            int result;
            System.out.println("*" + n);
            if (n == 1) return 1; // проверка входного параметра, если павен 1, то выход из метода
            if (n == 2) return 2; // проверка входного параметра, если павен 2, то выход из метода
            result = factorial1(n - 2) * n;
            return result;
        }

        private int factorial2(int n) {
            int result = n;
            int j = n;
            for (int i = n; i > 2; i = i - 2) { // метод без рекрусии
                System.out.println("*" + j);
                j = j - 2;
                result = result * j;
            }
            return result;
        }
    }
}
