import java.util.Scanner;

public class Main {
    public static int sumOfDays(int[] days, int m, int d){
        int sum = 0;

        for(int i=0; i<m-1; i++){
            sum += days[i];
        }

        sum += d;

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = sumOfDays(days, m2, d2) - sumOfDays(days, m1, d1);

        String w = sc.next();
        int index = -1;

        for(int i=0; i<7; i++){
            if(w.equals(weeks[i])){
                index = i;
                break;
            }   
        }

        int diff_index; // 요일 인덱스 차이

        if(index==0){
            diff_index = 6;
        }else{
            diff_index = index - 1;
        }

        System.out.print((diff - diff_index)/7 + 1);

    }
}