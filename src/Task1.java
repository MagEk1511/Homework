import java.util.Scanner;

public class Task1 {

    public static int a = 1;
    public static int b = 1;
    public static int c = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n - 2; ++i) {
            c = a;
            a = a + b;
            b = c;
        }
        System.out.println(a);
    }
}