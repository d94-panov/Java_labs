package YT.Begin;

public class V20_Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Bob"); // если в скобках будет пусто, то выведется "Привет из первого конструктора"
        human1.setName("Bob");
        human1.setAge(40);
    }
}

class Human1 {
    private String name;
    private int age;

    public Human1() {
        System.out.println("Привет из первого конструктора");
    }

    public Human1(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human1(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
