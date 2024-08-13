import java.util.Scanner;

public class Main {
    public static boolean modify(String s) {
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (modify(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}