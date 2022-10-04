import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        int prev_int = in.nextInt();
        int next_int;
        for (int i = 1; i < num_len; ++i) {
            next_int = in.nextInt();
            if(prev_int < next_int) System.out.print(next_int + " ");
            prev_int = next_int;
            }
        }
    }
