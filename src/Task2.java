import java.util.Scanner;

public class Task2 {

    public static int num_len = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n + " -> ");
        byte k = 0;
        if(n < 0) k = 1; n *= -1;
        while(n % 10 == 0){
            n /= 10;
        }
        int a = n;
        while(a > 0){
            ++num_len;
            a /= 10;
        }
        int[] ms = new int[num_len];
        while(n > 0){
            ms[a] = n % 10;
            n /= 10;
            ++a;
        }
        if(k == 1) System.out.print("-");
        for (int i: ms
        ) {
            System.out.print(i);
        }
    }
}
