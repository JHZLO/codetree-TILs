import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] dict = new String[n];
        
        for(int i=0; i<n; i++){
            dict[i] = sc.next();
        }

        Arrays.sort(dict); // 사전 순 정렬

        for(int i=0; i<n; i++){
            System.out.println(dict[i]);
        }

        
    }
}