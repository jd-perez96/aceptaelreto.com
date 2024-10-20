package volumes.volume3.problem300;

import java.util.Scanner;

public class AeR300 {
    
    private static void solve() {
        String word = IN.next();
        boolean[] letters = new boolean[5];
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'a':
                    letters[0] = true;
                    break;
            
                case 'e':
                    letters[1] = true;
                    break;

                case 'i':
                    letters[2] = true;
                    break;

                case 'o':
                    letters[3] = true;
                    break;

                case 'u':
                    letters[4] = true;
                    break;
                default:
                    break;
            }
        }

        boolean pentavolica = true;
        for (boolean b : letters) {
            pentavolica = pentavolica && b;
        }

        System.out.println(pentavolica ? "SI" : "NO");
    }

    public static void main(String[] args) {
        int T = IN.nextInt();
        for (int i = 0; i < T; i++) {
            solve();
        }
    }

    private static final Scanner IN = new Scanner(System.in);
}
