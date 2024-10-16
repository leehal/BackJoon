import java.util.Scanner;

public class 부재중전화 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int D = sc.nextInt();
        int result = L;
        int d = D;
        int i =0;
        while (i < N) {
            if (result<=d && d<result+5)break;
            if (result > d) {
                while (d < result) {
                    d += D;
                }
            }else {
                i++;
                result += L + 5;
            }
        }

        System.out.println(d);
    }
}
