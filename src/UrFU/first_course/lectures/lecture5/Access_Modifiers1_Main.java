package UrFU.first_course.lectures.lecture5;

public class Access_Modifiers1_Main {
    public static void main(String[] args) {
        Access_Modifiers1_Car car = new Access_Modifiers1_Car(); // создаем объект класса
        car.setModel("lada"); // присваиваем значение при помощи сеттера

        System.out.println("до выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        Access_Modifiers1_Main main = new Access_Modifiers1_Main(); // создаем объект класса
        car = main.updateCar(car); // у метода Main вызываем публичный метод updateCar

        System.out.println("после выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        main.showInfo("Информация");
        System.out.println(car);
    }

    public Access_Modifiers1_Car updateCar(Access_Modifiers1_Car car) { // метод возвращает объект класса Car
        car.setAge(2);
        car.setPrice(1_000_000);
        return car;
    }

    public void showInfo(String info) { // метод showInfo
        System.out.println(info);
    }
}
