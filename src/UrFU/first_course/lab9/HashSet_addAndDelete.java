package UrFU.first_course.lab9;

import java.util.HashSet;

public class HashSet_addAndDelete {
    public static void main(String[] args) {
        HashSet hset = new HashSet();

        for (int i = 0; i < 2000000; i++) {
            hset.add(i);
        }

        HashSet arrayHset = new HashSet();

        addBegin(arrayHset);
        addMiddle(arrayHset);
        addEnd(arrayHset);

        removeBegin(arrayHset);
        removeMiddle(arrayHset);
        removeEnd(arrayHset);
    }

    private static void addBegin(HashSet hset) {
        long start = System.nanoTime();
        hset.add(0);
        long end = System.nanoTime();
        System.out.println("Добавление в начало: " + (end - start));

    }

    private static void addMiddle(HashSet hset) {
        int j = hset.size() / 2;
        long start = System.nanoTime();
        hset.add(j);
        long end = System.nanoTime();
        System.out.println("Добавление в середину: " + (end - start));
    }

    private static void addEnd(HashSet hset) {
        int j = 1;
        long start = System.nanoTime();
        hset.add(j);
        long end = System.nanoTime();
        System.out.println("Добавление в конец: " + (end - start));
        System.out.println();
    }

    private static void removeBegin(HashSet hset) {
        long start = System.nanoTime();
        hset.remove(0);
        long end = System.nanoTime();
        System.out.println("Удаление в начале: " + (end - start));
    }

    private static void removeMiddle(HashSet hset) {
        int j = hset.size() / 2;
        long start = System.nanoTime();
        hset.remove(j);
        long end = System.nanoTime();
        System.out.println("Удаление в середине: " + (end - start));
    }

    private static void removeEnd(HashSet hset) {
        long start = System.nanoTime();
        hset.remove(hset.size() - 1);
        long end = System.nanoTime();
        System.out.println("Удаление в конце: " + (end - start));
    }
}
