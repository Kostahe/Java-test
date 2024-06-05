public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Bob", 40);
        Human human2 = new Human("Tom", 30);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        Human human3 = new Human("Rob", 50);
        human3.printNumberOfPeople();

    }
}

class Human {

    private String name;
    private int age;

    private static int countPeople;

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople += 1;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }



}