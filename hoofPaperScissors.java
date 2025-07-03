import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cow1Wins = 0;

        while (n-- > 0){
            int f = sc.nextInt();
            int s = sc.nextInt();
            if (f == 1){
                if (s == 2){
                    cow1Wins++;
                }
            }
            else if (f == 2){
                if (s == 3){
                    cow1Wins++;
                }
            }
            else if (f == 3){
                if (s == 1){
                    cow1Wins++;
                }
            }
        }
        System.out.println(cow1Wins);
    }
}