import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean A = a / 100 > 0 && a / 100 < 10 && a % 5 == 0;
        boolean B = b / 100 > 0 && b / 100 < 10 && b % 5 == 0;
        boolean C = c / 100 > 0 && c / 100 < 10 && c % 5 == 0;
        System.out.println(A && B || A && C || B && C);
    }

}
