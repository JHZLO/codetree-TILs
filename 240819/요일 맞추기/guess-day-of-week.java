import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};


        // m1월 d1일 >> 월요일
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff; // 요일 차이의 index
        int index; // 타겟의 요일 index;

        if(m1 == m2){
            if(d1 > d2){
                diff = (d1-d2)%7;
                if(1-diff < 0){
                    index = 7-(Math.abs(1-diff));
                }else{
                    index = 1-diff;
                }
                System.out.print(weeks[index]);
            }else if(d1 == d2){
                System.out.print(weeks[1]);
            }else{
                diff = (d2-d1)%7;
                if(1+diff > 6){
                    index = 1+diff - 7;
                }else{
                    index = 1+diff;
                }
                System.out.print(weeks[index]);
            }
        
        }

        int diff_day = 0; // month가 다른 경우 며칠 차이나는지

        if(m1 > m2){ // m1이 더 큰 경우
            for(int i=m2; i<m1-1; i++){
                diff_day += days[i];
            }
            diff_day += days[m2-1] - d2;
            diff_day += d1;

            diff = diff_day%7;

            if(1-diff < 0){
                index = 7-(Math.abs(1-diff));
            }else{
                index = 1-diff;
            }
            System.out.print(weeks[index]);
        }

        if(m2 > m1){ // m2이 더 큰 경우
            for(int i=m1; i<m2-1; i++){
                diff_day += days[i];
            }
            diff_day += days[m1-1] - d1;
            diff_day += d2;

            diff = diff_day%7;

            if(1+diff > 6){
                index = 1+diff - 7;
            }else{
                index = 1+diff;
            }
            System.out.print(weeks[index]);
        }
    }
}