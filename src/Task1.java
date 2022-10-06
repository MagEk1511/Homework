import java.util.Scanner;

public class Task1 {
    public static class NumberDigits{

        public static int sumOfDigits(int a){
            int sum = 0;
            while(a > 0){
                sum += a % 10;
                a /= 10;
            }
            return sum;
        }
        public static int sumOfSeven(int a, int b){
            int sum = 0;
            for (int i = a; i <= b; ++i) {
                if(i % 7 == 0 && i / 10 > 0) sum += NumberDigits.sumOfDigits(i);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(NumberDigits.sumOfSeven(a, b));
    }
}
