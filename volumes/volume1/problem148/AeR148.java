package volumes.volume1.problem148;

import java.util.Scanner;

public class AeR148 {
    
    private static String time;

    private static void solve() {
        int HH = Integer.parseInt(time.substring(0, 2));
        int MM = Integer.parseInt(time.substring(3));

        MM = (60 - MM) % 60;
        if (MM != 0) HH++;
        MM += (24 - HH) * 60;

        System.out.println(MM);
    }

    public static void main(String[] args) {
        while (!(time = IN.next()).equals("00:00")) solve();
    }

    private static final Scanner IN = new Scanner(System.in);
}
