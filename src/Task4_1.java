import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        int[] arr = new int[num_len];
        for (int i = 0; i < num_len; ++i) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < num_len; ++i) {
            if(arr[i] > arr[i - 1]) System.out.print(arr[i] + " ");
        }
    }
}
