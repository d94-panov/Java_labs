package UrFU.first_course.lectures.lecture4;

public class Classes_Student {
    // Поля класса
    private String firstName;
    private String lastName;
    int age;

    // Конструктор
    public Classes_Student() {
    }

    // Методы
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
