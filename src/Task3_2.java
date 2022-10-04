import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        boolean fl = true;
        int mn = 0;
        int c;
        for (int i = 0; i < num_len; ++i) {
            c = in.nextInt();
            if(fl) {mn = c; fl = false;}
            if(c > 0 && c < mn){ mn = c;}
        }
        System.out.println(mn);
    }
}
