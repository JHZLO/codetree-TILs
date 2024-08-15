import java.util.Scanner;

public class Main {
    static int cnt = 0;
    public static int divide(int n){
        if(n == 1){
            return cnt;
        }
        if(n % 2 == 0){
            cnt += 1;
            return divide(n/2);
        }else{
            cnt += 1;
            return divide(n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(divide(n));
    }
}