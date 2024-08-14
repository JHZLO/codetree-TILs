import java.util.Scanner;

public class Main {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        printNum(n);
    }
}