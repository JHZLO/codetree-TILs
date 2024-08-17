import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int findMidium(int[]arr, int length){
        int[] tempArr = Arrays.copyOf(arr, length); // 길이만큼 복사!!!

        Arrays.sort(tempArr); // 정렬

        return tempArr[length/2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] mediumArr = new int[n/2+1];

         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){ 
                mediumArr[i/2] = findMidium(arr, i + 1);
            }
        }

        for(int i=0; i<n/2+1; i++){
            System.out.print(mediumArr[i]+" ");
        }
        
    }
}