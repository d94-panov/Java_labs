package UrFU.first_course.lab5;

//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.

public class Example1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.setCh1('K');
        int code = task1.getCodeSymbol();
        System.out.println("getCodeSymbol = "+code);

        task1.showCodeValue();
    }
}

class Task1 {
    private char ch1; // закрытое символьное поле

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public int getCodeSymbol(){
        return ch1;
    }
    public void showCodeValue(){
        System.out.println("Value = "+ch1);
        System.out.println("Code = "+(int) ch1);
    }
}