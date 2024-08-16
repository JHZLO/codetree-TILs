import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean matchArr(Integer[] arr1, Integer[] arr2){
        for (int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();

        Integer[] arr1 = new Integer[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1); // 정렬 1

        Integer[] arr2 = new Integer[n];
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2); // 정렬 2

        if(matchArr(arr1,arr2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}