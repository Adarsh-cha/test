
import java.io.*;
import java.util.*;

public class FerrisWheel {
    static InputStreamReader in;
    static PrintWriter out;
    public static void main(String[] args)  throws IOException{
        in = new InputStreamReader(System.in);
        out = new PrintWriter(System.in);

        int n = in.nextInt();
        long x = Long.parseLong(in.nextToken());

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int minAns = 0;
        while (start <= end) {
            if (arr[start] + arr[end] <= x) {
                minAns++;
                start++;
                end--;
            }
            else {
                minAns++;
                end--;
            }
        }
        System.out.println(minAns);
    }
}
