public class Main {
    public static void main(String[] args) {
//        Info info1 = new Animal(1);
//        Info info2 = new Person("Bob");
//        info1.showInfo(); you can only use methods from interface info
//        info2.showInfo();
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        outputInfo(animal);
        outputInfo(person);

    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}