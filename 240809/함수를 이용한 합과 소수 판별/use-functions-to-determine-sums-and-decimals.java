import java.util.Scanner;

public class Main {
    public static int isMagicNum(int a, int b){
        int cnt = 0;

        for (int i = a; i<= b; i++){
            boolean isPrime = true;
            int x = 0;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    continue;
                }
            }
            if( ((i % 10) + (i / 10)) % 2 == 0 && isPrime){
                    cnt += 1;
            } 
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(isMagicNum(a,b));
    }
}