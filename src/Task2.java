import java.util.Scanner;

public class Task2 {
    public static int r = 11;
    public static int w = 2;
    public static int eaten = 0;
    public static int total_eaten = 0;

    public Task2() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; n > i; ++i) {
            if (i % 2 == 1) {
                r *= 3;
                if (r > 19000000) {
                    r = 19000000;
                }
            }

            if (i % 2 == 0) {
                if (eaten > r) {
                    w = w - (10 * w - r) / 10 + 1;
                }

                eaten = 10 * w;
                r -= eaten;
                total_eaten += eaten;
            }

            if (total_eaten > 69) {
                w += total_eaten / 70;
                total_eaten %= 70;
            }
        }

        System.out.println("" + n + " Month\nWolves: " + w + "\nRabbits: " + r + "\n");
    }
}
