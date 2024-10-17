import java.util.Scanner;

public class 뒤집힌덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(re(re(x)+re(y)));
    }
    public static int re(int a){
        int b=0;
        while (a>=10){
            int c = a%10;
            a /=10;
            b+=c;
            b*=10;
        }
        b+=a;
        return b;
    }
}
