import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        String[] day_of_week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] weekCheck = {0, 0, 0, 0, 0, 0, 0}; // 0 ~ 6 : 월 ~ 일
        int[] days_of_month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayCheck = 0;

        while (true){
            if (m1 == m2 && d1 == d2){
                weekCheck[dayCheck]++;
                break;
            }

            d1++;
            weekCheck[dayCheck++]++;

            if (dayCheck > 6){
                dayCheck = 0;
            }

            if (d1 > days_of_month[m1]){
                m1++;
                d1 = 1;
            }
        }

        for(int i = 0; i < 7; i++){
            if (day_of_week[i].equals(day)){
                System.out.println(weekCheck[i]);
            }
        }
    }
}