package UrFU.first_course.lectures.lecture6;

public class Interfaces3_WaterPipe implements Interfaces3_Stateable {
    @Override
    public void printState(int n) {
        if (n == OPEN) {
            System.out.println("open");
        } else if (n == CLOSED) {
            System.out.println("closed");
        } else {
            System.out.println("no");
        }
    }
}
