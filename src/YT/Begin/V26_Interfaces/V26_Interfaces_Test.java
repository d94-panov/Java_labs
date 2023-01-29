package YT.Begin.V26_Interfaces;

public class V26_Interfaces_Test {
    public static void main(String[] args) {
//        V26_Interfaces_Animal animal1 = new V26_Interfaces_Animal(1);
//        V26_Interfaces_Person person1 = new V26_Interfaces_Person("Bob");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();

        V26_Interfaces_Info info1 = new V26_Interfaces_Animal(1);
        V26_Interfaces_Info info2 = new V26_Interfaces_Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

        V26_Interfaces_Animal animal1 = new V26_Interfaces_Animal(1);
        V26_Interfaces_Person person1 = new V26_Interfaces_Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(V26_Interfaces_Info info) {
        info.showInfo();
    }
}
