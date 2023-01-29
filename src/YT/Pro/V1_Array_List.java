package YT.Pro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class V1_Array_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        System.out.println(list);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//
//        System.out.println("Размер массива " + list.size());

//        for (int i = 0; i < list.size(); i++) { // вывести все элементы list
//            System.out.println(list.get(i));
//        }
//
//        for (Integer x : list)
//            System.out.println(x);

        list.remove(5);
        System.out.println(list);

        // мы проводим много удалений из нашего листа
        list = new LinkedList<>();
    }
}
