package YT.Begin.V41_Abstract_class;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
    }
}
