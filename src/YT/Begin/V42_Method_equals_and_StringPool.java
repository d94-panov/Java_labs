package YT.Begin;

public class V42_Method_equals_and_StringPool {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);

        // Как хранятся объекты в памяти:
        // animal1   ->     {1}
        // animal2   ->     {1}

//        V42Animal animal1 = new V42Animal(1);
//        V42Animal animal2 = new V42Animal(2);
//
//        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";
        String string2 = "Hello1";

        System.out.println(string1.equals(string2));
    }
}

class V42Animal {
    private int id;

    public V42Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        V42Animal otherAnimal = (V42Animal) obj;
        return this.id == otherAnimal.id;
    }
}
