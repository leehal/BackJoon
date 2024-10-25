import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호키2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        for (int i = 0; i < num; i++) {
            long s = Long.parseLong(bf.readLine());
            for (long j = 2; j <=1000000 ; j++) {
                if (s%j==0){
                    System.out.println("NO");
                    break;
                }
                if (j == 1000000){
                    System.out.println("YES");
                }
            }
        }
    }
}
