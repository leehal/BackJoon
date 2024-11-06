import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = bf.readLine().split(" ");
        int m = Integer.parseInt(MN[0]);
        int n = Integer.parseInt(MN[1]);

        int cnt=0;

        int mn=m*n;
        int a =0;
        while (mn>0){
            if (cnt!=0){
                cnt++;
            }
            for (int i = 0; i < n-a; i++) {
                mn--;
            }
            cnt++;
            a++;

            for (int i = 0; i < m-a; i++) {
                mn--;
            }
        }
        System.out.println(cnt);
    }
}
