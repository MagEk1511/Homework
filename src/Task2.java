import java.util.Scanner;

public class Task2 {

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
        int sx = in.nextInt();
        int sy = in.nextInt();
        int[][] matrix = new int[sy][sx];
        int counter = 0;
        for (int i = 0; i < sy; i += 2) {
            for (int j = 0; j < sx; j++) {
                matrix[i][j] = counter;
                ++counter;
            }
            counter += sx;
        }
        counter = sx;
        for (int i = 1; i < sy; i += 2) {
            for (int j = sx - 1; j >= 0; --j) {
                matrix[i][j] = counter;
                ++counter;
            }
            counter += sx;
        }
        printArray(matrix);
    }
}

