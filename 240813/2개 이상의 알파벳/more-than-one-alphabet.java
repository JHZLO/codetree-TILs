import java.util.Scanner;

public class Main {
    public static boolean checkWord(String n){
        char tmp = n.charAt(0);
        for(int i=0; i< n.length(); i++){
            if(n.charAt(i) != tmp){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if(checkWord(word)){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
    }
}