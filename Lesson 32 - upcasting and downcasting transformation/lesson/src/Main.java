public class Main {
    public static void main(String[] args) {

        // Upcasting - Восходящее преобразование
        Dog dog = new Dog();
        Animal animal = dog;

        Animal animal2 = new Dog();
        animal2.eat();

        // Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();



//        Animal a = new Animal(); Error class Animal cannot be cast to class Dog (Down casting is dangerous)
//        Dog d = (Dog) a;
//        d.bark();
    }
}