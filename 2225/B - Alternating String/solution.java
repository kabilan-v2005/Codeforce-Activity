import java.util.*;
 
public class Main {
 
    static boolean check(String s, char start) {
        int n = s.length();
        List<Integer> mismatch = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? start : (start == 'a' ? 'b' : 'a');
            if (s.charAt(i) != expected) {
                mismatch.add(i);
            }
        }
 
        if (mismatch.size() == 0) return true;
 
        // check if mismatch indices are continuous
        for (int i = 1; i < mismatch.size(); i++) {
            if (mismatch.get(i) != mismatch.get(i - 1) + 1) {
                return false;
            }
        }
 
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            if (check(s, 'a') || check(s, 'b')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}