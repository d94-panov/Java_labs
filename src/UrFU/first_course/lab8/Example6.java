package UrFU.first_course.lab8;

//Разработать проект, в котором для ввода, вывода и изменения
//односвязного линейного списка создать следующие методы:
//а) с использованием цикла:
//– ввод с головы createHead();
//– ввод с хвоста createTail();
//– вывод (возвращается строка, сформированная из элементов
//списка) toString();
//– добавление элемента в начало списка AddFirst();
//– добавление элемента в конец списка AddLast();
//– вставка элемента в список с указанным номером Insert();
//– удаление элемента с головы списка RemoveFirst();
//– удаление последнего элемента списка RemoveLast();
//– удаление из списка элемента с указанным номером
//Remove();
//а) с использованием рекурсии:
//– ввод с головы createHeadRec();
//– ввод с хвоста createTailRec();
//– вывод (возвращается строка, сформированная из элементов
//списка) toStringRec().

public class Example6 {
    public static void main(String[] args) {
        Node4 LinList = new Node4();

        LinList.createHead(new int[]{1, 2, 3});
        System.out.println(LinList.toString());

        LinList.createTail(new int[]{3, 2, 1});
        System.out.println(LinList.toString());

        LinList.AddFirst(1);
        System.out.println(LinList.toString());

        LinList.AddLast(10);
        System.out.println(LinList.toString());

        LinList.Insert(10, 2);
        System.out.println(LinList.toString());

        LinList.RemoveFirst();
        System.out.println(LinList.toString());

        LinList.RemoveLast();
        System.out.println(LinList.toString());

        LinList.Remove(3);
        System.out.println(LinList.toString());

        LinList.createHeadRec(4);
        System.out.println(LinList.toStringRec(LinList.head));

        LinList.createTailRec(5);
        System.out.println(LinList.toStringRec(LinList.head));
    }
}

class Node4 {
    protected int value;
    protected Node4 next;
    protected Node4 head;

    public Node4 getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node4(int value, Node4 next) {
        this.value = value;
        this.next = next;
    }

    Node4() {
    }

    protected void createHead(int[] values) {
        Node4 head = new Node4(values[0], null);
        Node4 tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node4(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("Ввод с головы: ");
    }

    protected void createTail(int[] values) {
        Node4 head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node4(values[i], head);
        }
        this.head = head;
        System.out.println("Ввод с хвоста: ");
    }

    public String toString() {
        Node4 ref = head;
        String toString = "";
        while (ref != null) {
            toString += ref.value;
            ref = ref.next;
        }
        return toString;
    }

    protected void AddFirst(int head) {
        this.head = new Node4(head, this.head);
        System.out.println("Добавление элемента в начало списка");
    }

    protected void AddLast(int tail) {
        Node4 newTail = new Node4(tail, null);
        Node4 ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.println("Добавление элемента в конец списка");
    }

    protected void Insert(int middle, int queue) {
        Node4 newNode = new Node4(middle, null);
        Node4 ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.println("Вставка элемента в список с указанным номером: ");
    }

    protected void RemoveFirst() {
        this.head = this.head.next;
        System.out.println("Удаление элемента с головы списка: ");
    }

    protected void RemoveLast() {
        Node4 ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println("Удаление последнего элемента списка: ");
    }

    protected void Remove(int queue) {
        Node4 ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.println("Удаление из списка элемента с указанным номером: ");
    }

    Node4 createHeadRec(int value) {
        if (value == 0) {
            System.out.println("\nВвод с головы с использованием рекурсии: ");
            return null;
        }
        return this.head = new Node4(value, createHeadRec(value - 1));
    }

    int createTailRec(int value) {
        if (value == 0) {
            System.out.println("Ввод с хвоста с использованием рекурсии: ");
            Node4 head = null;
            this.head = head;
            return 0;
        }
        head = new Node4(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node4 head) {
        if (head == null) {
            return "Вывод (возвращается строка, сформированная из элементов списка)";
        }
        return head.getValue() + toStringRec(head.getNext());
    }
}
