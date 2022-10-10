import java.util.Scanner;

public class Task3 {
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
        int[][] matrix = new int[n][n];
        int x = 0;
        int y = 0;
        int s = 0;
        int k = 1;
        while(k <= n * n){
            while(x  < n - s){
                matrix[y][x] = k;
                ++x;
                ++k;
            }
            --x;
            ++y;
            while(y < n - s){
                matrix[y][x] = k;
                ++y;
                ++k;
            }
            --y;
            --x;
            while(x >= s){
                matrix[y][x] = k;
                --x;
                ++k;
            }
            ++x;
            s++;
            --y;
            while(y >= s){
                matrix[y][x] = k;
                --y;
                ++k;
            }
            ++y;
            ++x;


        }
        printArray(matrix);
    }
}
