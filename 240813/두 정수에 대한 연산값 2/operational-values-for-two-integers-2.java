import java.util.Scanner;

class IntWrapper{

    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void changeNum(IntWrapper a, IntWrapper b){
        if(a.value < b.value){
            a.value += 10;
            b.value *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        changeNum(a,b);

        System.out.print(a.value+" "+b.value);
    }
}