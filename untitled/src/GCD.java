import java.util.Scanner;
public class GCD {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a % b,b);
        }
        return gcd(a, b % a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a and b here: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println("Real GCD: " + gcd);
        scanner.close();
    }
}
