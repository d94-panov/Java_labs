package UrFU.first_course.lectures.lecture5;

public class Access_Modifiers2_Main {
    public static void main(String[] args) {
        Access_Modifiers2_Car car = new Access_Modifiers2_Car();
        car.setModel("lada");

        System.out.println("до выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        Access_Modifiers2_Main main = new Access_Modifiers2_Main();
        car = main.updateCar(car);

        System.out.println("после выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        main.showInfo("Информация");
    }

    private Access_Modifiers2_Car updateCar(Access_Modifiers2_Car car) {
        car.setAge(2);
        car.setPrice(1_000_000);
        return car;
    }

    public void showInfo(String info) { // метод showInfo
        System.out.println(info);
    }
}
