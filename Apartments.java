
import java.io.IOException;
import java.io.InputStream;
import java.text.BreakIterator;
import java.util.*;

public class Apartments {
    static class FastReader {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
            if (ptr >= len) {
                ptr = 0;
                len = in.read(buffer);
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        public int nextInt() throws IOException {
            int c; while ((c = readByte()) != -1 && (c <= ' ')) ;
            boolean neg = (c == '-'); if (neg) c = readByte();
            int val = 0;
            do val = val * 10 + c - '0';
            while ((c = readByte()) >= '0' && c <= '9');
            return neg ? -val : val;
        }
    }
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n;  i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        int answer = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr1.length) {
            if (Math.abs(arr[i] - arr1[j]) <= k) {
                answer++;
                i++;
                j++;
            }
            else if (arr[i] < arr1[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        System.out.println(answer);
    }
}