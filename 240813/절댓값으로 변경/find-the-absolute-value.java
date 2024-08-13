import java.util.Scanner;

public class Main {
    public static void absoluteArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i] *= -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        absoluteArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}