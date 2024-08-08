import java.util.Scanner;

public class Main {
    public static int calculate(int a, char o, int c) {
        switch (o) {
            case '+':
                return a + c;
            case '-':
                return a - c;
            case '*':
                return a * c;
            case '/':
                if (c != 0) {
                    return a / c;
                }
            default:
                throw new IllegalArgumentException("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        
        try {
            int result = calculate(a, b, c);
            System.out.println(a + " " + b + " " + c + " = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}