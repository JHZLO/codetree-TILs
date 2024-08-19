import java.util.Scanner;

public class Main {
    public static int sumOfDays(int[] days, int m, int d) {
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += days[i];
        }
        sum += d;
        return sum;
    }

    public static int numOfDay(String s) {
        // 간단한 비교를 위해 요일을 숫자로 나타내줍니다.
        if(s.equals("Mon")) return 0;
        else if(s.equals("Tue")) return 1;
        else if(s.equals("Wed")) return 2;
        else if(s.equals("Thu")) return 3;
        else if(s.equals("Fri")) return 4;
        else if(s.equals("Sat")) return 5;
        return 6;
    }
    public static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 윤년 고려
        String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetWeek = sc.next();

        int startDay = sumOfDays(days, m1, d1);
        int endDay = sumOfDays(days, m2, d2);

        // 시작 요일의 인덱스 계산
        int startWeekIndex = 0;  // 월요일 인덱스는 0
        
        for(int date = startDay; date <= endDay; date++) {
            // 오늘의 요일이 A요일과 같다면 정답에 추가합니다.
            if(startWeekIndex == numOfDay(targetWeek)) ans++;
            startWeekIndex = (startWeekIndex + 1) % 7;
        }

        System.out.println(ans);
    }
}