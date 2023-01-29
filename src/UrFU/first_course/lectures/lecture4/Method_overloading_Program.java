package UrFU.first_course.lectures.lecture4;

public class Method_overloading_Program {
    public int sum(int x, int y) { // метод 1
        return x + y;
    }

    public double sum(double x, double y) { // метод 2
        return x + y;
    }

    public int sum(int x, int y, int z) { // метод 3
        return x + y + z;
    }
}
