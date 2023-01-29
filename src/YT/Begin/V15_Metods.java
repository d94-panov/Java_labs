package YT.Begin;

public class V15_Metods {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak(); //вызываем метод speak
        person1.sayHello(); //методы можно вызывать неошраниченное кол-во раз
        Person1 person2 = new Person1();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak(); //вызываем метод speak
    }
}

class Person1 { //класс
    String name;
    int age;

    void speak() { // метод
        for (int i = 0; i < 3; i++) { //вызовем метод 3 раза
            System.out.println("My name " + name + ", i am " + age + " years");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
