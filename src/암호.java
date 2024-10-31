import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); //가로
        String[] st = bf.readLine().split("");
        List<String> list = new ArrayList<>();

        int a = (int) Math.ceil((double) st.length / n); //세로

        for (int i = 0; i < st.length; i++) {
                if (i % 2 == 0) {
                    list.add(st[i*n]);
                } else {
                    for (int j = 0; j < n; j++) {
                        list.add(st[n*(i+1) - j-1]);
                    }

                }
        }

        for (String s : list) {
            System.out.print(s);
        }
    }

}
