import java.util.ArrayList;
import java.util.List;

public class Main {
    //////// Do java 5 ////////
    public static void main(String[] args) {
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(0);
        System.out.println(animal);


        /////// with appearance of generics ///////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        // error animals2.add(ourAnimal);

        String animal2 = animals2.get(1);

        //////// Java 7 ///////
        List<String> animals3 = new ArrayList<>();
        animals3.add("a");
        String animalStr = animals3.get(0);
        System.out.println(animalStr);


    }

}

class Animal {

}
