import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  
        int b = sc.nextInt();  
        int c = sc.nextInt();  

        int startDay = 11;
        int startHour = 11;
        int startMinute = 11;

        // 시작 시간과 목표 시간을 모두 분 단위로 변환
        int startTime = (startDay * 24 * 60) + (startHour * 60) + startMinute;
        int targetTime = (a * 24 * 60) + (b * 60) + c;

        int timeDifference = targetTime - startTime;

        System.out.print(timeDifference);
    }
}