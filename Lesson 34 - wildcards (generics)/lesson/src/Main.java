import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);


    }

    /*
        Object
        Animal
        Dog
        extends - Animal and Dog: (List<? extends Animal>)
        super - Object and Animal: (List<?> super Animal>)

     */

    private static void test(List<? extends Animal> list) {
        for(Animal animal : list) {
            animal.eat();
        }
    }
//    private static void test(List<Animal> list) {
//        for(Animal animal : list) {
//            System.out.println(animal);
//        } if you use List<Animal> it will be error because in lists aren't working polymorphism you need to use <? extends Animal>
}