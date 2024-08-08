import java.util.Scanner;

public class Main {
    public static boolean checkNum(int n){
        return (n / 10) % 3 == 0 || (n % 10) % 3 == 0;
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