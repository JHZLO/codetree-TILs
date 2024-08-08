import java.util.Scanner;

public class Main {
    public static boolean checkNum(int n){
        while(n != 0){
            int x = n % 10;
            if (x % 3 == 0){
                return true;
            }
            n = n / 10;
        }
        return false;
    }
    public static boolean isMagicNum(int n){
        return n % 3 == 0 || checkNum(n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if (isMagicNum(i)){
                cnt ++;
            }
        }

        System.out.print(cnt);

    }
}