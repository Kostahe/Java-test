public class Main {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";

        for(String string:strings) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int number:numbers1) {
            sum += number;
        }
        System.out.println(sum);
    }
}