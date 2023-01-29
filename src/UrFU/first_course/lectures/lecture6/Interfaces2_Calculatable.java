package UrFU.first_course.lectures.lecture6;

public interface Interfaces2_Calculatable {
    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    private int sumAll(int a, int b) {
        return a + b;
    }
}
