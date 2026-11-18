
import java.util.Scanner;

abstract class AbstractClassRecursion {
    public abstract int factorial(int n);
}

class SubClassRecursion extends AbstractClassRecursion {
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

public class MainRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SubClassRecursion obj = new SubClassRecursion();

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = obj.factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);

        input.close();
    }
}
