package volumes.volume5.problem595;

import java.util.Scanner;

public class AeR595 {

    private static void solve() {
        int problem = IN.nextInt();
        System.out.println(problem / 100);
    }

    public static void main(String[] args) {
        int T = IN.nextInt();
        for (int i = 0; i < T; i++) {
            solve();
        }
    }

    private static final Scanner IN = new Scanner(System.in);
}
