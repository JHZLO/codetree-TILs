import java.util.Scanner;

public class Main {
    public static int findMin(int a, int b, int c){
        int min = 100;

        if (a < min){
            min = a;
        }
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        return min;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(findMin(a,b,c));
    }
}