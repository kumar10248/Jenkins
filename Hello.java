import java.util.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a, b;

        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);  // Take the first argument as a
            b = Integer.parseInt(args[1]);  // Take the second argument as b
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no.1: ");
            a = sc.nextInt();
            System.out.println("Enter no.2: ");
            b = sc.nextInt();
        }

        int c = a + b;
        System.out.println("Sum: " + c);
    }
}
