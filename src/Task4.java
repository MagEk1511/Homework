import java.util.Scanner;

public class Task4 {
    public static int min = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            if(n % 10 < min && n % 10 != 0) min = n % 10;
            n /= 10;
        }
        System.out.println(min);
    }
}
