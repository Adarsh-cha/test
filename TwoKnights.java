import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();

        for (int i = 1; i <= n; i++) {
            long total = ((long)i * i  * (i * i - 1)) / 2;
            long attack = 4 * (i - 1) * (i - 2);
            System.out.println(total - attack);
        }
    }
}