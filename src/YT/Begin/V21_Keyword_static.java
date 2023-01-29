package YT.Begin;

public class V21_Keyword_static {
    public static void main(String[] args) {

        Human2 h1 = new Human2("Bob", 40);
        Human2 h2 = new Human2("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3 = new Human2("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();

        /*
        Human2.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human2.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
         */
    }
}

class Human2 {
    private String name;
    private int age;

    private static int countPeople;

    //public static String description;

    public Human2(String name, int age) { // Конструктор
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }
     */

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}