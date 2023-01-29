package YT.Begin;

public class V25_Inheritance_Lesson25 {
    public static void main(String[] args) {
        V25_Inheritance_Animal animal = new V25_Inheritance_Animal();
        animal.eat();
        animal.sleep();
        V25_Inheritance_Dog dog = new V25_Inheritance_Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
