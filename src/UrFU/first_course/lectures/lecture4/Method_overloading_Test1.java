package UrFU.first_course.lectures.lecture4;

public class Method_overloading_Test1 {
    public static void main(String[] args) {

        Method_overloading_Program program = new Method_overloading_Program();

        System.out.println(program.sum(2, 3)); // 5
        System.out.println(program.sum(4.5, 3.2)); // 7.7
        System.out.println(program.sum(4, 3, 7)); // 14
    }
}
