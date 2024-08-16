import java.util.Scanner; 
import java.util.Arrays;

public class Main {
    public static int findMaxGroup(Integer[] arr, int n){
        Arrays.sort(arr);
        int max = 0;

        for (int i=0; i<n; i++){
            max = Math.max(max, arr[i]+arr[(2*n-1)-i]);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 그룹의 개수

        Integer[] arr = new Integer[2*n];

        for(int i=0; i<2*n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(findMaxGroup(arr,n));
    }
}