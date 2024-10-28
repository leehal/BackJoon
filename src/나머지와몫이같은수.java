import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지와몫이같은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bf.readLine());
        long a = 0;
//        for (long i = n+1; i<n*n; i++) {
//            if(i/n==i%n){
//                a+=i;
//            }
//        }
//        System.out.println(a);

        for (long i = 1; i<n; i++) {
            a+=i*(n+1);
        }
        System.out.println(a);
    }
}
