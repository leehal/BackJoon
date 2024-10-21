import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세준세비 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String t = bf.readLine();
            for (int i = 0; i < Integer.parseInt(t); i++) {
                if (!bf.readLine().isEmpty()){
                    continue;
                }
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
                    System.out.println("B");
                } else {
                    System.out.println("S");
                }
//                System.out.println();
            }
        }catch (NumberFormatException e){

        }
    }
}
