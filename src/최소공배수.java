import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] arr = br.readLine().split(" ");
//            if (!br.readLine().isEmpty()){}
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c =1;
            while (true){
                if(c*Math.max(a,b)%Math.min(a,b)==0){
                    list.add(c*Math.max(a,b));
                    break;
                }
                c++;
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
