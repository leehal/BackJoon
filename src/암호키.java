import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호키 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        long max = (long) Math.pow(10, 6);

        // 소수 판별 함수
        for (int i = 0; i < num; i++) {
            long s = Long.parseLong(bf.readLine());
            String result = "NO";

            // s의 약수 중에서 100만 이상인 소수 찾기
            for (long k = max + 1; k * k <= s; k++) {
                if (s % k == 0 && isPrime(k)) {
                    result = "YES";
                    break;
                }
            }

            System.out.println(result);
        }
    }

    // 소수 판별 함수
    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
