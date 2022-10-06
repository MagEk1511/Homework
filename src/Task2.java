import java.util.Scanner;

public class Task2 {
    public static class MyArrays {
        public static double avgOf4Digits(int[] array) {
            int sum = 0;
            int count = 0;
            for (int i : array
            ) {
                if (i > 999 && i < 10000){
                    sum += i;
                    count++;
                }
            }
            if (count != 0) {
                return (double) sum / count;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_len = in.nextInt();
        int[] array = new int[num_len];
        for (int i = 0; i < num_len; ++i) {
            array[i] = in.nextInt();
        }
        System.out.println(MyArrays.avgOf4Digits(array));
    }
}
