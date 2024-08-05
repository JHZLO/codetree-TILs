import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        int tmp, n;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = lcm(a, b);
        System.out.println(result);
    }
}