import java.util.Scanner;

public class Main {
    public static void NNRect(int n){
        int x = 1;
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                System.out.print(x+" ");
                x += 1;
                x = x % 10;
                if ( x == 0){
                    x = 1;
                }
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NNRect(n);
    }
}