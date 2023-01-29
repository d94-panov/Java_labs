package UrFU.first_course.lectures.lecture5;

import static java.lang.Math.PI; // импортируем константу Пи
import static java.lang.Math.cos;

public class StaticImport {
    public static void main(String[] args) {
        double value = cos(PI * 4); // константа импортирована, поэтому не надо писать название класса Math
        System.out.println(value);
    }
}
