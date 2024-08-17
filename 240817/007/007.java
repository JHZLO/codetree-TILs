import java.util.Scanner;

class Secret{
    String code, location;
    int time;

    public Secret(String code, String location, int time){
        this.code = code;
        this.location = location;
        this.time = time;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String location = sc.next();
        int time = sc.nextInt();

        Secret x = new Secret(code,location,time);

        System.out.println("secret code : "+x.code);
        System.out.println("meeting point : "+x.location);
        System.out.println("time : "+x.time);

    }
}