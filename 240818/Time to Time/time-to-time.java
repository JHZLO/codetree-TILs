import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();

        int time = 0;

        while(true){
            if(hour1 == hour2 && minute1 == minute2){
                break;
            }

            minute1 ++;
            time ++;
            if(minute1 == 60){
                hour1 ++;
                minute1 = 0;
            }
        }

        System.out.print(time);

        
    }
}