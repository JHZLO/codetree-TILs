import java.util.Scanner;

public class Main {
    public static boolean isSubSequence(int[] a, int[] b){

        for(int i = 0; i < a.length - b.length; i++){
            for (int j = i; j < i + b.length; j++){
                if(a[j] != b[j-i]){
                    continue;
                }
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];

        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<b.length; i++){
            b[i] = sc.nextInt();
        }

        if(isSubSequence(a,b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}