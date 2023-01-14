package UrFU.first_course.lab8;

public class Example5_tail {
    public static void main(String[] args) {
// добавление элементов с перемещением головы (наращивание с головы)
        Node3 head = null;
// начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node3(i, head);
        }
// вывод элементов на экран
        Node3 ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Node3 { // описание элемента
    public int value;
    public Node3 next;

    Node3(int value, Node3 next) { // конструктор
        this.value = value;
        this.next = next;
    }
}
