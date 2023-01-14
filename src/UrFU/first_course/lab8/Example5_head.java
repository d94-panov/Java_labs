package UrFU.first_course.lab8;

//Создать два проекта, в которых продемонстрировать два
//способа создания линейного однонаправленного списка (с головы и с
//хвоста) согласно примеру 2 из второго раздела. Отработать код с
//помощью отладчика и привести скриншоты минимум трех точек
//обработанных отладчиком.

public class Example5_head {
    public class DSD_create { // главный класс
        public static void main(String[] args) {
// создание 1-го узла, который изначально является и головой, и хвостом списка
            Node2 head = new Node2(0, null);
            Node2 tail = head;
// добавление элементов с наращиванием хвоста
            for (int i = 0; i < 9; i++) {
                tail.next = new Node2(i + 1, null);
                tail = tail.next;
// указатель на созданный элемент запоминается
            }
// как указатель на новый хвост
// вывод элементов на экран
            Node2 ref = head;
// ref – рабочая переменная для текущего узла
            while (ref != null) {
                System.out.print(" " + ref.value);
                ref = ref.next;
            }
        }
    }
}

class Node2 { // описание элемента
    public int value;
    public Node2 next;

    Node2(int value, Node2 next) { // конструктор
        this.value = value;
        this.next = next;
    }
}
