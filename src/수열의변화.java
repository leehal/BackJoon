import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수열의변화 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bf.readLine().split(" ");
        bf.readLine();
        String[] arr = bf.readLine().split(",");
        System.out.println(Integer.parseInt(num[0])+Integer.parseInt(arr[0]));
    }
}
