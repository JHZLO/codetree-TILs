import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int col = 3;
        int row = 5;

        for (int i = 0; i < row; i++) {
            String value = "";
            for (int j = 0; j < col; j++) {
                char ch = sc.next().charAt(0);
                value += ch + " ";
            }
            System.out.println(value.toUpperCase());
        }
    }
}