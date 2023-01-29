package UrFU.first_course.lab9;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_addAndDelete {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet<>();

        for (int i = 0; i < 2000000; i++) {
            sortedSet.add(i);
        }

        SortedSet arraySortedSet = new TreeSet<>();

        addBegin(arraySortedSet);
        addMiddle(arraySortedSet);
        addEnd(arraySortedSet);

        removeBegin(arraySortedSet);
        removeMiddle(arraySortedSet);
        removeEnd(arraySortedSet);
    }

    private static void addBegin(SortedSet sortedSet) {
        long start = System.nanoTime();
        sortedSet.add(0);
        long end = System.nanoTime();
        System.out.println("Добавление в начало: " + (end - start));

    }

    private static void addMiddle(SortedSet sortedSet) {
        int j = sortedSet.size() / 2;
        long start = System.nanoTime();
        sortedSet.add(j);
        long end = System.nanoTime();
        System.out.println("Добавление в середину: " + (end - start));
    }

    private static void addEnd(SortedSet sortedSet) {
        int j = 1;
        long start = System.nanoTime();
        sortedSet.add(j);
        long end = System.nanoTime();
        System.out.println("Добавление в конец: " + (end - start));
        System.out.println();
    }

    private static void removeBegin(SortedSet sortedSet) {
        long start = System.nanoTime();
        sortedSet.remove(0);
        long end = System.nanoTime();
        System.out.println("Удаление в начале: " + (end - start));
    }

    private static void removeMiddle(SortedSet sortedSet) {
        int j = sortedSet.size() / 2;
        long start = System.nanoTime();
        sortedSet.remove(j);
        long end = System.nanoTime();
        System.out.println("Удаление в середине: " + (end - start));
    }

    private static void removeEnd(SortedSet sortedSet) {
        long start = System.nanoTime();
        sortedSet.remove(sortedSet.size() - 1);
        long end = System.nanoTime();
        System.out.println("Удаление в конце: " + (end - start));
    }
}
