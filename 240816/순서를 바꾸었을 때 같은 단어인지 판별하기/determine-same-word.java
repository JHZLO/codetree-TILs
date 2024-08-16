import java.util.*;

public class Main {
    public static boolean matchString(char[] arr1, char[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;

        if(length1 != length2){
            return false;
        }

        for(int i = 0; i < length1; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if(matchString(chars1, chars2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}