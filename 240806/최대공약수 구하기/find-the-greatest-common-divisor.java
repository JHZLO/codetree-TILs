import java.util.Scanner;

public class Main {
    public static void gcd(int a, int b){
        int tmp, n;

        if (a<b){
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b!= 0){
            n = a%b;
            a = b;
            b = n;
        }

        System.out.print(a);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
    }
}