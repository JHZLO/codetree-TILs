import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }

    }
    public static String searchSeason(int month) {
    if(month == 12 || month == 1 || month == 2) {
        return "Winter";
    } else if(month == 3 || month == 4 || month == 5) {
        return "Spring";
    } else if(month == 6 || month == 7 || month == 8) {
        return "Summer";
    } else if(month == 9 || month == 10 || month == 11) {
        return "Fall";
    } else {
        return "-1";
    }
}
    public static boolean isExist(int year, int month, int day){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leap_days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month < 1 || month > 12){
            return false;
        }
        if(isLeapYear(year)){
            if(day < 1 || day > leap_days[month-1]){
                return false;
            }
        }else{
            if(day < 1 || day > days[month-1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isExist(Y,M,D)){
            System.out.println(searchSeason(M));
        }else{
            System.out.print(-1);
        }
    }
}