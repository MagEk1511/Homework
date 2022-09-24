import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum_a = a * n + b * n / 100;
        int sum_b = b * n % 100;
        System.out.println("Output:" + sum_a + " " + sum_b);
    }
}
