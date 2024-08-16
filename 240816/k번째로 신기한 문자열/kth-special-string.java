import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 문자열의 개수
        int k = sc.nextInt(); // k번째 문자열 출력
        String T = sc.next(); // T로 시작하는 문자열 
        int TLength = T.length();

        List<String> TtoDict = new ArrayList<>(); // T로 시작하는 단어 리스트

        for(int i = 0; i < n; i++){
            String word = sc.next();
            if(word.length() >= TLength && word.substring(0, TLength).equals(T)){
                TtoDict.add(word);
            }
        }

        Collections.sort(TtoDict); // 사전 순 정렬

        if(k <= TtoDict.size()){
            System.out.print(TtoDict.get(k-1)); // k번째 문자열 출력
        } 
    }
}