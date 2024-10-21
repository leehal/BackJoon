import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 이진수팔진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] t = bf.readLine().split("");
        int i = t.length-1;
        List<Integer> list = new ArrayList<>();
        while (true){
            int a =0;
            for (int j = 0; j < 3; j++) {
                int b = 0;
                if (i>=0) {
                    b = Integer.parseInt(t[i]);
                }
                a+= (int) Math.pow(2,j)*b;
                i--;
            }
            list.add(a);

            if (i<0)break;
        }

        for (int j = list.size()-1; j >= 0; j--) {
            System.out.print(list.get(j));
        }
    }
}
