import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -1629706124961824589L;

    private int id;
    private String name;
    private int age;
    private byte type;



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.id + " : " + name;
    }
}
