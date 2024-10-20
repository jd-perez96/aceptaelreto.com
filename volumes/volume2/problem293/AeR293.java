package volumes.volume2.problem293;

import java.util.Scanner;

public class AeR293 {
    
    private static void solve() {
        System.out.println(
            IN.nextInt() * 6 +
            IN.nextInt() * 8 +
            IN.nextInt() * 10 +
            IN.nextInt() * IN.nextInt() * 2
        );
    }

    public static void main(String[] args) {
        int T = IN.nextInt();
        for (int i = 0; i < T; i++) {
            solve();
        }
    }

    private static final Scanner IN = new Scanner(System.in);
}
