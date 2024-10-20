package volumes.volume1.problem106;

import java.util.Scanner;

/**
 * ¡Acepta el Reto! 106: Códigos de barras
 * 
 * @url https://aceptaelreto.com/problem/statement.php?id=106
 */
public class AeR106 {

    private static String ean;

    /**
     * Compute the error digit, add the control digit and compute the mod 10.
     * @return (error code + last digit) % 10
     */
    private static int computeErrorDigit() {
        int digit = 0;
        boolean even = false;

        // For each digit, sum it
        for (int i = ean.length() - 2; i >= 0; i--) {
            int x = Character.getNumericValue(ean.charAt(i));
            if (!even) x *= 3;  // if the digit is not even (odd), multiply per 3
            digit += x;
            even = !even;
        }

        // Add last digit
        digit += Character.getNumericValue(ean.charAt(ean.length() - 1));

        // Return solution mod 10.
        return digit % 10;
    }

    /**
     * Get EAN-13 country from the problem specifications.
     * 
     * @return Contry string. Otherwise, `Desconocido`.
     */
    private static String getCountry() {
        if (ean.startsWith("0")) {
            return "EEUU";
        } else if (ean.startsWith("380")) {
            return "Bulgaria";
        } else if (ean.startsWith("50")) {
            return "Inglaterra";
        } else if (ean.startsWith("539")) {
            return "Irlanda";
        } else if (ean.startsWith("560")) {
            return "Portugal";
        } else if (ean.startsWith("70")) {
            return "Noruega";
        } else if (ean.startsWith("759")) {
            return "Venezuela";
        } else if (ean.startsWith("850")) {
            return "Cuba";
        } else if (ean.startsWith("890")) {
            return "India";
        }

        return "Desconocido";
    }

    private static void solve() {
        // If length is greater than 13, return NO
        if (ean.length() > 13) {
            System.out.println("NO");
            return;
        }

        // Fill zero left padding is needed
        if (ean.length() > 8 && ean.length() < 13) {
            ean = String.format("%0" + (13 - ean.length()) + "d", 0) + ean;
        } else if (ean.length() < 8) {
            ean = String.format("%0" + (8 - ean.length()) + "d", 0) + ean;
        }

        // Compute error digit + last digit % 10
        // and assert is valid
        int errorDigit = computeErrorDigit();
        if (errorDigit != 0) {
            System.out.println("NO");
            return;
        }

        // Print solution, add country for EAN-13
        System.out.print("SI");
        if (ean.length() == 13) {
            System.out.print(" " + getCountry());
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // while the EAN is different to 0
        while (!(ean = IN.next()).equals("0")) solve();
    }

    private static final Scanner IN = new Scanner(System.in);

}