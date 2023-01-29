package UrFU.first_course.lectures.lecture5;

public class Keyword_static_Main {
    public static void main(String[] args) {
        Keyword_static_Car car1 = new Keyword_static_Car();
        Keyword_static_Car car2 = new Keyword_static_Car("lada", 100_000, 3);
        Keyword_static_Car car3 = new Keyword_static_Car();

        System.out.println(Keyword_static_Car.numbersOfCars);
        Keyword_static_Car.showInfo("Привет");
    }

    private Keyword_static_Car updateCar(Keyword_static_Car car) {
        car.setAge(2);
        car.setPrice(1_000_000);
        return car;
    }
}
