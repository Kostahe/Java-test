import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String seperator = File.separator;
        String path = "C:\\Users\\Gamer\\Desktop\\test.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        //while (scanner.hasNextLine()) {
        //  System.out.println(scanner.nextLine());
        //  }
        // First line
        // Second line
        // Third line

        // file was 1 2 3 output was [1, 2, 3]
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int counter = 0;

        for(String number : numbersString) {
             numbers[counter] = Integer.parseInt(number);
             counter += 1;
        }

        System.out.println(Arrays.toString(numbers));

//      // if test is in string than you can just create file like this File file = new File("test2.txt")


        scanner.close();
    }
}