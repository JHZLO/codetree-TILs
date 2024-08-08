import java.util.Scanner;

public class Main {
    public static boolean leapYear(int n){
        if(n % 4 == 0){
            if( n % 100 == 0 && n % 400 != 0){
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(leapYear(n)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}