import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        var i = Float.parseFloat(s);
        System.out.println(i < -2 || (i > 3 && i < 6) || i > 9);
    }
}
