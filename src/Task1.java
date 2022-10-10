import java.util.Scanner;

public class Task1 {

    static void printArray(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[m][n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < m * n; k++) {
            i = k / n;
            j = k % n;
            a[i][j] = i * j;
        }
        printArray(a);
    }
}
