import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int time = 0;
        int day = 11;
        int hour = 11;
        int minute = 11;

        while(true){ 
            if(day==a && hour==b && minute==c){
                break;
            }

            minute ++;
            time ++;
            if(minute == 60){
                minute = 0;
                hour ++;
                if(hour == 24){
                    day++;
                    hour = 0;
                }
            }
        }

        System.out.print(time);
    }
}