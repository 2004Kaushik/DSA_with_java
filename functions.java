import java.util.*;

public class functions {

    public static void main(String[] args) { 
        System.out.println("result is: " + sum());
    };

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        int c = a + b;
        return c;
    }
}
