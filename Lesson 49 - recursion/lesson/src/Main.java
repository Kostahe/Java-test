public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }



    private static void counter(int n) {
        if (n==0)
            return;

        System.out.println(n);

        counter(n-1);
    }

    private static int factorial(int n) {
        if(n==0)
            return 1;

        return n * factorial(n-1);



    }
}