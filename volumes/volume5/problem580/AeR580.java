package volumes.volume5.problem580;

import java.util.Arrays;
import java.util.Scanner;

public class AeR580 {
    
    private static int n, differents, photos, no_photos, idx;
    private static int[] Q = new int[7];
    private static boolean mafalta;

    private static String character;

    private static void solve() {
        // Clear queue of characters before use it
        Arrays.fill(Q, 0);
        differents = 0; photos = 0;
        mafalta = false;

        // For each character
        for (; n > 0; n--) {
            // Read data
            character = IN.next();              // Read it
            idx = characterToIndex();           // Get index for character

            // Process new character
            if (Q[idx]++ == 0) differents++;    // Increment queue
            if (idx == 0) mafalta = true;       // Check if is Mafalda

            // Make photo if possible
            if (differents >= 3 && mafalta) {
                photos++;                               // Take photo
                for (int i = 0; i < Q.length; i++) {    // characters leave the queue
                    if (Q[i] > 0 && --Q[i] == 0) differents--;
                }
                if (Q[0] == 0) mafalta = false;         // Check if there is any Mafalda
            }
        }

        // Count no photos :(
        no_photos = 0;
        for (int x : Q) {
            no_photos += x;
        }

        // Print result
        System.out.println(photos + " " + no_photos);
    }

    /**
     * Map character name to index:
     * Mafalda      --> 0
     * Felipe       --> 1
     * Manolito     --> 2
     * Susanita     --> 3
     * Miguelito    --> 4
     * Libertad     --> 5
     * Guille       --> 6
     * 
     * @return
     */
    private static int characterToIndex() {
        if (character.charAt(0) == 'M') {
            if (character.length() == 7) return 0;  // Mafalda
            return character.length() == 8 ? 2 : 4; // Manolito or Miguelito
        }
        if (character.charAt(0) == 'F') return 1;   // Felipe
        if (character.charAt(0) == 'S') return 3;   // Susanita
        return character.charAt(0) == 'L' ? 5 : 6;  // Libertad o Guille
    }

    public static void main(String[] args) {
        while ((n = IN.nextInt()) != 0) solve();
    }

    private static final Scanner IN = new Scanner(System.in);
}
