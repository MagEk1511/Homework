import java.util.Scanner;

public class Task3_1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        int[] arr = new int[num_len];
        boolean fl = true;
        for (int i = 0; i < num_len; ++i) {
            arr[i] = in.nextInt();
        }
        int mn = 0;
        for (int i: arr
             ) {
            if(fl) {mn = i; fl = false;}
            if(i > 0 && i < mn){ mn = i;}
        }
        System.out.println(mn);
    }
}
