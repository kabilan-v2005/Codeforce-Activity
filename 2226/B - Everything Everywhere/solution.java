import java.util.*;
import java.io.*;
 
public class Main {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            
            long count = 0;
            for (int i = 0; i < n - 1; i++) {
                int a = p[i], b = p[i + 1];
                int g = gcd(a, b);
                if (Math.abs(a - b) == g) {
                    count++;
                }
            }
            
            sb.append(count).append("
");
        }
        
        System.out.print(sb);
    }
}