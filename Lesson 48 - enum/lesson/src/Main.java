public class Main {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }



}