import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String input = sc.next();

    public static int subStr(String sub){

        for(int i=0; i<=input.length() - sub.length(); i++){
            if(input.substring(i,i+sub.length()).equals(sub)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        String sub = sc.next();

        int index = subStr(sub);

        System.out.print(index);
        
    }
}