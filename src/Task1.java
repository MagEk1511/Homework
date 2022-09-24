import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var i = in.nextInt();
        int sum = i / 100 + (i / 10) % 10 + i % 10;
        int next_i = i / 2 * 2 + 2;
        System.out.print(sum);
        System.out.println(" " + next_i);
    }
}