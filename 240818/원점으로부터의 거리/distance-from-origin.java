import java.util.*;

class Position implements Comparable<Position>{
    int x,y;
    int number;

    public Position(int x, int y, int number){
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public int compareTo(Position position){
        return (Math.abs(this.x)+Math.abs(this.y)) - (Math.abs(position.x)+Math.abs(position.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Position[] pos = new Position[n];

        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            pos[i] = new Position(x,y,i);
        }

        Arrays.sort(pos);

        for(int i=0; i<n; i++){
            System.out.println(pos[i].number+1);
        }
    }
}