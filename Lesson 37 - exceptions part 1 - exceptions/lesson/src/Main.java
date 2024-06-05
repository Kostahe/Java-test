import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Error file not found");
        }

        System.out.println("After block try catch");

        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test.txt"); // you need to use exception in all methods that you call this method
        Scanner scanner = new Scanner(file);
    }
}