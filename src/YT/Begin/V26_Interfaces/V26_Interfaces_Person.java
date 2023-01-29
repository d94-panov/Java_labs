package YT.Begin.V26_Interfaces;

public class V26_Interfaces_Person implements V26_Interfaces_Info {
    public String name;

    public V26_Interfaces_Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
