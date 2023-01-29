package UrFU.first_course.lectures.lecture5;

public class Access_Modifiers1_Car {
    private String model;
    private double price;
    private int age;

    public Access_Modifiers1_Car() { // публичный конструктор
    }

    public Access_Modifiers1_Car(String model, double price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
    }

    public String getModel() { // модификатор доступа
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Car " + this.model;
    }
}
