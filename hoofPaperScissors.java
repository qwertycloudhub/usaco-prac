import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cow1 = new int[4];
        int[] cow2 = new int[4];

        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            cow1[f]++;
            cow2[s]++;
        }

        int wins = 0;

        int beat12 = Math.min(cow1[1], cow2[2]);
        wins += beat12;
        cow1[1] -= beat12;
        cow2[2] -= beat12;

        int beat23 = Math.min(cow1[2], cow2[3]);
        wins += beat23;
        cow1[2] -= beat23;
        cow2[3] -= beat23;

        int beat31 = Math.min(cow1[3], cow2[1]);
        wins += beat31;
        cow1[3] -= beat31;
        cow2[1] -= beat31;

        System.out.println(wins);
    }
}