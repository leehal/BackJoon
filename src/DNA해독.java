import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DNA해독 {
    public static void main(String[] args) throws IOException {
        Map<String  ,Character> map = new HashMap<>();
        map.put("AA", 'A');
        map.put("AG", 'C');
        map.put("AC", 'A');
        map.put("AT", 'G');
        map.put("GG", 'G');
        map.put("GC", 'T');
        map.put("GT", 'A');
        map.put("CC", 'C');
        map.put("CT", 'G');
        map.put("TT", 'T');

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        char[] arr = bf.readLine().toCharArray();
        String s = "";
        for (int i = num-2; i >= 0; i--) {
            s = "" + arr[i + 1] + arr[i];
            if (!map.containsKey(s)) {
                s = "" + arr[i] + arr[i + 1]; // 순서를 바꿔서 문자열 생성
            }            arr[i]= map.get(s);
        }
        System.out.println(arr[0]);
    }

}

