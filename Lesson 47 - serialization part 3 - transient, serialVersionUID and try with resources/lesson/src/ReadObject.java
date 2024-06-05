import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){  // (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) you can do it like this a lot easier and you don't need to close
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
