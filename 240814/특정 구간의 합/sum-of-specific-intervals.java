import java.util.Scanner;

public class Main {
    static int[] arr = new int[100];

    public static void pairIndexAdd(int[][] pair, int m){
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = pair[i][0]-1; j < pair[i][1]; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] pair = new int[m][2];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<2; j++){
                pair[i][j] = sc.nextInt();
            }
        }

        pairIndexAdd(pair,m);
    }
}