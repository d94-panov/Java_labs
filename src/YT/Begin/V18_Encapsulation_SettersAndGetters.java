package YT.Begin;

public class V18_Encapsulation_SettersAndGetters {
    public static void main(String[] args) {
        Person4 person1 = new Person4();
        person1.setName("Какое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе:" + person1.getAge());
    }
}

class Person4 {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне" + age + " лет");
        }
    }
}
