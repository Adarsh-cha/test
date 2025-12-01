
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();

        int max = 1;
        int len = n.length();
        int i = 0;
        while (i < len) {
            int count = 1;
            while (i < len-1 && n.charAt(i) == n.charAt(i+1)) {
                count++;
                i++;
            }
            max = Math.max(max, count);
            i++;
        }
        System.out.println(max);
    }
}
