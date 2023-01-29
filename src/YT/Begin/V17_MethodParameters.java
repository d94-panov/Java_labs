package YT.Begin;

public class V17_MethodParameters {
    public static void main(String[] args) {
        Person3 person1 = new Person3();
        person1.setNameAndAge("Roman",20);

        String s1 = "Vova";
        Person3 person2 = new Person3();
        person2.setNameAndAge(s1,30);

        person1.speak();
        person2.speak();
    }
}

class Person3 { //класс
    String name;
    int age;

    void setNameAndAge(String username, int userage){ // параметров может быть сколько угодно
        name = username;
        age = userage;
    }

    int calculateYearsToRetirment(){ //параметр метода - то что в скобках
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