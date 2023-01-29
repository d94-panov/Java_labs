package YT.Begin.V26_Interfaces;

public class V26_Interfaces_Animal implements V26_Interfaces_Info {
    public int id;

    public V26_Interfaces_Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
