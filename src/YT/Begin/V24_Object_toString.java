package YT.Begin;

public class V24_Object_toString {
    public static void main(String[] args) {
        Human3 h1 = new Human3("Bob", 40);
        System.out.println(h1);
    }
}

class Human3 {
    private String name;
    private int age;

    public Human3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}
