import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static class MyArrays {
        public static int minToBegin(int[] array) {
            int min = array[0];
            int min_index = 0;
            int index = 0;
            int equal_quant = 0;
            for (int i : array) {
                if (i < min) {
                    min = i;
                    min_index = index;
                    equal_quant = 0;
                }
                if(min == i) ++equal_quant;
                ++index;
            }
            if(equal_quant == array.length) return -1;
            for (int i = min_index; i > 0; --i) {
                array[i] = array[i - 1];
            }
            array[0] = min;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_len = in.nextInt();
        int[] array = new int[arr_len];
        for (int i = 0; i < arr_len; ++i) {
            array[i] = in.nextInt();
        }
        System.out.println(MyArrays.minToBegin(array));
        System.out.println(Arrays.toString(array));
    }

}