import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class promotion {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("promote.in"));
        int preB = sc.nextInt();
        int postB = sc.nextInt();
        int preS = sc.nextInt();
        int postS = sc.nextInt();
        int preG = sc.nextInt();
        int postG = sc.nextInt();
        int preP = sc.nextInt();
        int postP = sc.nextInt();

        int ascP = postP - preP;
        int ascG = postG - preG + ascP;
        int ascS = postS - preS + ascG;

        PrintWriter out = new PrintWriter(new File("promote.out"));
        out.println(ascS);
        out.println(ascG);
        out.println(ascP);
        out.close();
    }
}