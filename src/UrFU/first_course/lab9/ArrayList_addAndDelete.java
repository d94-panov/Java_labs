package UrFU.first_course.lab9;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_addAndDelete {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();

        for (int i = 0; i < 2000000; i++) {
            List.add(i);
        }

        List<Integer> arrayList = new ArrayList<>();

        addBegin(arrayList);
        addMiddle(arrayList);
        addEnd(arrayList);

        removeBegin(arrayList);
        removeMiddle(arrayList);
        removeEnd(arrayList);

    }

    private static void addBegin(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(0, j);
        long end = System.nanoTime();
        System.out.println("Добавление в начало: " + (end - start));

    }

    private static void addMiddle(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(list.size() / 2, j);
        long end = System.nanoTime();
        System.out.println("Добавление в середину: " + (end - start));
    }

    private static void addEnd(List<Integer> list) {
        int j = 1;
        long start = System.nanoTime();
        list.add(j);
        long end = System.nanoTime();
        System.out.println("Добавление в конец: " + (end - start));
        System.out.println();
    }

    private static void removeBegin(List<Integer> list) {
        long start = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();
        System.out.println("Удаление в начале: " + (end - start));
    }

    private static void removeMiddle(List<Integer> list) {
        int j = list.size() / 2;
        long start = System.nanoTime();
        list.remove(j);
        long end = System.nanoTime();
        System.out.println("Удаление в середине: " + (end - start));
    }

    private static void removeEnd(List<Integer> list) {
        long start = System.nanoTime();
        list.remove(list.size() - 1);
        long end = System.nanoTime();
        System.out.println("Удаление в конце: " + (end - start));
    }
}
