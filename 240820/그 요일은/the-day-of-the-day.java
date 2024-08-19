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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int startDay = sumOfDays(days, m1, d1);
        int endDay = sumOfDays(days, m2, d2);

        String w = sc.next();

        int startWeekIndex = 0;  // 월요일 인덱스
        int targetIndex = -1;

        for (int i = 0; i < 7; i++) {
            if (w.equals(weeks[i])) {
                targetIndex = i;
                break;
            }
        }

        // 전체 차이에서 A 요일이 등장하는 횟수 계산
        int totalDays = endDay - startDay + 1;
        int firstDayIndex = (startDay + startWeekIndex) % 7;

        int count = 0;
        for (int i = 0; i < totalDays; i++) {
            if ((firstDayIndex + i) % 7 == targetIndex) {
                count++;
            }
        }

        System.out.println(count);
    }
}