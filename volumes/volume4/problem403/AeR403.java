package volumes.volume4.problem403;

import java.util.Scanner;

public class AeR403 {

    private static void solve() {
        int square_meters = IN.nextInt();
        int football_fields = IN.nextInt();

        int min_football_fields = 90 * 45 * football_fields;
        int max_football_fields = 120 * 90 * football_fields;
        
        System.out.println(
            square_meters >= min_football_fields && square_meters <= max_football_fields
            ? "SI" : "NO");
    }

    public static void main(String[] args) {
        int T = IN.nextInt();
        for (int i = 0; i < T; i++) solve();
    }

    private static final Scanner IN = new Scanner(System.in);

}
