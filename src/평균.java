import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double num = Integer.parseInt(bf.readLine());
        List<Double> list  = new ArrayList<>();
        double max = 0;
//        bf.readLine();
        double abs = 0;
        String[] c = bf.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            double b = Integer.parseInt(c[i]);

            list.add(b);
            if (b>max){
                max=b;
            }
        }

        for (Double i : list) {
            abs += i/max*100;
            System.out.println("max "+max);
            System.out.println("i "+i);
            System.out.println(i/max*100);
        }

        System.out.println(abs/num);
    }
}
