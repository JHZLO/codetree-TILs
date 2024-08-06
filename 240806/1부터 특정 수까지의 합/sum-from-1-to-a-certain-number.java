import java.util.Scanner;

public class Main {
    public static int tenpercent(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        result = tenpercent(n) / 10;
        System.out.print(result);
    }
}