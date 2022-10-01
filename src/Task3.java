import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        short ending = 1;
        if(n == 1) ending = 0;
        else if(n%10 > 1 && n%10 < 5) ending = 2;
        switch (ending){
            case 0:
                System.out.println(n + " TORT");
                break;
            case 1:
                System.out.println(n + " TORTOV");
                break;
            case 2:
                System.out.println(n + " TORTA");
        }
    }
}
