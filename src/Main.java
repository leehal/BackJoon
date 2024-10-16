import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nick = sc.next().split("");

        int l =0;
        int o =0;
        int v =0;
        int e =0;

        for (String s : nick) {
            if (s.equals("l")) {
                l++;
            } else if (s.equals("o")) {
                o++;
            } else if (s.equals("v")) {
                v++;
            } else if (s.equals("e")) {
                e++;
            }
        }

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            String[] team = sc.nextLine().split("");
        }
    }
}
