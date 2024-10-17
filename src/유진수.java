import java.util.Scanner;

public class 유진수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        String result = "No";
        for (int i = 1; i < arr.length; i++) {
            int a=1;
            for (int j = 0; j < i; j++) {
                a *= Integer.parseInt(arr[j]);
            }

            int b =1;
            for (int j = i; j < arr.length; j++) {
                b *= Integer.parseInt(arr[j]);
            }

            if (a==b){
                result = "Yes";
                break;
            }
        }
        System.out.println(result);
    }
}
