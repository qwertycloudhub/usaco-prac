import java.util.*;

public class RudolphChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            double d = sc.nextDouble();
            double h = sc.nextDouble();

            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                y[i] = sc.nextLong();
            }

            double totalArea = 0.0;
            double fullTriangleArea = 0.5 * d * h;
            totalArea += fullTriangleArea;

            for (int i = 1; i < n; i++) {
                long deltaY = y[i] - y[i - 1];

                if (deltaY >= h) {
                    totalArea += fullTriangleArea;
                } else {
                    double overlapHeight = h - deltaY;
                    double overlapBase = d * overlapHeight / h;
                    double overlapArea = 0.5 * overlapBase * overlapHeight;
                    totalArea += (fullTriangleArea - overlapArea);
                }
            }

            System.out.printf("%.10f\n", totalArea);
        }
    }
}
