import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 세준세비 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String t = bf.readLine();
        List<String > list  = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(t); i++) {
                if (bf.readLine().isEmpty()){}
                String[] nm = bf.readLine().split(" ");
                int s = 0;
                int b = 0;
                String[] d = bf.readLine().split(" ");
                for (int j = 0; j < Integer.parseInt(nm[0]); j++) {
                    int c = Integer.parseInt(d[j]);
                    if (s < c) {
                        s = c;
                    }
                }
                String[] e = bf.readLine().split(" ");
                for (int j = 0; j < Integer.parseInt(nm[1]); j++) {
                    int c = Integer.parseInt(e[j]);
                    if (b < c) {
                        b = c;
                    }
                }

                if (b > s) {
                    list.add("B");
                } else {
                    list.add("S");
                }
            }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
