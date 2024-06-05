public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        Object object = new Object();
        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;

    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
