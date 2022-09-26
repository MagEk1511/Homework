import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println((( y < 2 - x * x) && (y > x) || (y > 0 && y < x && y < 2 - x * x)) ? "YES" : "NO");
    }
}
