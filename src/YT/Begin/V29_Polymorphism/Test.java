package YT.Begin.V29_Polymorphism;

public class Test {
    public static void main(String[] args) {
//        V29_Polymorphism_Animal animal = new V29_Polymorphism_Animal();
//        V29_Polymorphism_Dog dog = new V29_Polymorphism_Dog();
//
//        animal.eat();
//        dog.eat();

//        V29_Polymorphism_Animal animal = new V29_Polymorphism_Dog(); // к объекту класса Dog можем обращаться через переменную родительского типа
//        animal.eat();

//        V29_Polymorphism_Dog dog = new V29_Polymorphism_Dog();
//        dog.eat();
//        dog.bark();

        Animal amimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(amimal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
