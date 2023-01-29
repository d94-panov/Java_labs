package YT.Begin;

public class V16_MethodReturnType {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "Roman";
        person1.age = 50;
        Person2 person2 = new Person2();
        person2.name = "Vova";
        person2.age = 20;
        int year1 = person1.calculateYearsToRetirment();
        int year2 = person2.calculateYearsToRetirment();
        System.out.println("Pervomu cheloveku do pensii: "+year1+" let");
        System.out.println("Vtoromu cheloveku do pensii: "+year2+" let");
    }
}

class Person2 { //класс
    String name;
    int age;

    int calculateYearsToRetirment(){
        int years = 65-age;
        return years; //возвращает и выходит из метода
    }

    void speak() { // метод
        for (int i = 0; i < 3; i++) { //вызовем метод 3 раза
            System.out.println("My name " + name + ", i am " + age + " years");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
