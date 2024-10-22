import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수열의변화 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bf.readLine().split(" ");
        String[] arr = bf.readLine().split(",");
        int[] result = new int[Integer.parseInt(num[0])];
        for (int i = 0; i < Integer.parseInt(num[1]); i++) {
            for (int j = 1; j < Integer.parseInt(num[0])-i; j++) {
                result[j - 1] = Integer.parseInt(arr[j]) - Integer.parseInt(arr[j-1]);
                arr[j-1]= String.valueOf(result[j-1]);
            }
            
        }
        for (int i = 0; i < Integer.parseInt(num[0])-Integer.parseInt(num[1]); i++) {
            if (i == Integer.parseInt(num[0]) - Integer.parseInt(num[1]) - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
