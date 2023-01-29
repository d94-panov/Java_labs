package YT.Begin.V32_up_and_down_conversion;

public class Test {
    public static void main(String[] args) {

        // Upcasting - восходящее преобразование
        Animal animal = new Dog();

        // Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal; // надо явно указать преобразование
        dog2.bark();
    }
}
