package UrFU.first_course.lectures.lecture4;

public class Classes_Test1 {
    public static void main(String[] args) {
        Classes_Student student = new Classes_Student();

        student.setFirstName("Иванов");
        student.setLastName("Иван");
        student.setAge(30);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
    }
}
