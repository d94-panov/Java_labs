package YT.Begin;

import java.util.ArrayList;
import java.util.List;

public class V33_Generics {
    public static void main(String[] args) {

        // так было до Java 5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat"); // добавить какой-то объект
        animals.add("dog"); // индекс 1
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        // стало в Java 5 с появлением дженериков
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        // стало в Java 7
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {

}
