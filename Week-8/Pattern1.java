import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        int a15 = 0, SuM = 0;
        for (int z = 1; z <= n; ++z, a15 = 0) {
            for (int space = 1; space <= n - z; ++space) {
                System.out.print("  ");
            }
            while (a15 != 2 * z - 1) {
                System.out.print("* ");
                SuM += 1;
                ++a15;
            }
            System.out.println();
        }
        System.out.print(SuM);
    }
}
