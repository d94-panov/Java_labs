package YT.Begin.V34_Wildcards_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfAnimal.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

        /*
        Иерархия наследования:
        Object
        Animal
        Dog
         */
    }

    private static void test(List<? extends Animal> list) { // приватный статический метод
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
