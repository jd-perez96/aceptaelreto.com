package volumes.volume2.problem248;

import java.util.Scanner;

public class AeR248 {
    
    private static int L, max, curr;
    private static int[] MEM = new int[500_000];

    private static void solve() {
        max = 0; curr = 0;
        int i = 0;

        // mem first half of the sequence
        for (; i < 500_000 && i < L; i++) {
            int x = IN.nextInt(); MEM[i] = x;
            curr = Math.max(curr + x, 0);
            max = Math.max(max, curr);
        }

        // play second half of the sequence without save it in mem
        for (; i < L; i++) {
            int x = IN.nextInt();
            curr = Math.max(curr + x, 0);
            max = Math.max(max, curr);
        }

        // if we end the sequence in positive, play again the mem sequence part
        for (i = 0; i < 500_000 && i < L && curr > 0; i++) {
            curr += MEM[i];
            max = Math.max(max, curr);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        while ((L = IN.nextInt()) != 0) solve();
    }

    private static final Scanner IN = new Scanner(System.in);

}
