import java.util.Scanner;

public class Main {
    public static int even(int n){
        if(n == 2){
            return 2;
        }
        if(n % 2 == 0){
            return even(n-1)+n;
        }else{
            return even(n-1);
        }
    }
    public static int odd(int n){
        if(n==1){
            return 1;
        }

        if(n % 2 != 0){
            return odd(n-1)+n;
        }else{
            return odd(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.print(even(n));
        }else{
            System.out.print(odd(n));
        }
    }
}