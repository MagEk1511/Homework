import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        var i = in.nextInt();
        System.out.println("Output: " + i / 3600 % 24 + ":" + ((i - i / 3600 * 3600) / 60 < 10 ? "0" : "")
                + (i - i / 3600 * 3600) / 60 + ":" + (i % 60 < 10 ? "0" : "") + i % 60 );
    }
}
