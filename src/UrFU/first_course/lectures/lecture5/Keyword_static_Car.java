package UrFU.first_course.lectures.lecture5;

public class Keyword_static_Car {
    static int numbersOfCars;
    private String model;
    private double price;
    private int age;

    public Keyword_static_Car() {
        numbersOfCars++;
    }

    public Keyword_static_Car(String model, double price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
        numbersOfCars++;
    }

    public static void showInfo(String info) {
        System.out.println(info);
    }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}
