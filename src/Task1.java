import java.util.Scanner;

public class Task1 {
    public static int num_len = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a = n;
        System.out.print(n + " -> ");
        while(a > 0){
            ++num_len;
            a /= 10;
        }
        int[] ms = new int[num_len];
        while(n > 0){
            ms[num_len - a - 1] = n % 10;
            n /= 10;
            ++a;
        }

        for (int i: ms
             ) {
            System.out.print(i == d ? "" : i);
        }

    }
}
