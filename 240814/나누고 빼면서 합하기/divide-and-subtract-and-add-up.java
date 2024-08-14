import java.util.Scanner;

public class Main {
    static int sum = 0;
    public static void addArr(int[] arr, int m){
        while(m != 0){
            sum += arr[m-1]; 
            if(m % 2 == 0){
                m/=2;
            }else{
                m-=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        addArr(arr,m);
        System.out.print(sum);
    }
}