import java.util.*;

class Sequence implements Comparable<Sequence>{
    int x;
    int number; // 원래 순서
    int index; // 현재 순서

    public Sequence(int x, int number, int index){
        this.x = x;
        this.number = number;
        this.index = index;
    }

    @Override
    public int compareTo(Sequence sequence){
        if(this.x == sequence.x){
            return this.number - sequence.number;
        }
        return this.x - sequence.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Sequence[] seq = new Sequence[n];

        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int number = i;
            int index = i;

            seq[i] = new Sequence(x,number,index);
        }
        

        // 숫자 순으로 정렬
        Arrays.sort(seq, new Comparator<Sequence>(){
            @Override
            public int compare(Sequence a, Sequence b){
                if(a.x == b.x){
                    return a.number - b.number;
                }
                return a.x - b.x;
            }
        });

        // 현재 순서 index 업데이트
        for(int i=0; i<n; i++){
            seq[i].index = i;
        }


        // 원래 순서대로 다시 정렬
        Arrays.sort(seq, new Comparator<Sequence>(){
            @Override
            public int compare(Sequence a, Sequence b){
                return a.number - b.number;
            }
        });

        // 이동한 위치 출력
        for(int i=0; i<n; i++){
            System.out.print(seq[i].index+1+" ");
        }

    }
}