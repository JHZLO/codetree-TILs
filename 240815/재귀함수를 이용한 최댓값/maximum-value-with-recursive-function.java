import java.util.Scanner;

public class Main {
    
    static int n;
    static int[] arr = new int[100];

    static int max = 0;

    public static int findMax(int x){
        if(x == n-1){
            return max;
        }

        if(arr[x] > max){
            max = arr[x];
        }

        return findMax(x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(findMax(0));
    }
}