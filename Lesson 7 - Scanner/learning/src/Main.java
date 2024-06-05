import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int user_input = scan.nextInt();
        System.out.println("Привет ваше число" + user_input);

    }
}