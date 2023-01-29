package YT.Begin.V45_47_Serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people,bin"))) {
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();

//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);

//            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
