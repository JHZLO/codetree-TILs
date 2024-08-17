import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class WeatherForecast implements Comparable<WeatherForecast>{
    LocalDate date; 
    String day, weather;

    public WeatherForecast(String date, String day, String weather){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = LocalDate.parse(date, formatter);
        this.day = day;
        this.weather = weather;
    }

    @Override
    public int compareTo(WeatherForecast other) {
        return this.date.compareTo(other.date);
    }

     public void printForecast() {
        System.out.println(this.date + " " + this.day + " " + this.weather);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        WeatherForecast[] forecast = new WeatherForecast[n];
        
        for(int i=0; i<n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            forecast[i] = new WeatherForecast(date,day,weather);
        }

        Arrays.sort(forecast); // 날짜순으로 정렬

        for(int i=0; i<n; i++){
            if(forecast[i].weather.equals("Rain")){
                forecast[i].printForecast();
                break;
            }
        }
    }
}