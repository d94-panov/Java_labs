package YT.Begin.V45_47_Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = -3722203743604454371L;
    private int id;
    private String name; // transient не даем сериализовывать поле

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
