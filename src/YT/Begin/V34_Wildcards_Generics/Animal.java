package YT.Begin.V34_Wildcards_Generics;

public class Animal {
    private int id;

    public Animal() { // дефолтный конструктор, который ничего не принимает на вход

    }

    public Animal(int id) { // конструктор
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
