package UrFU.first_course.lectures.lecture5;

public class Access_Modifiers2_Car {
    private String model;
    private double price;
    private int age;

    Access_Modifiers2_Car() {
    }

    Access_Modifiers2_Car(String model, double price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
    }

    String getModel() { // модификатор доступа
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}
