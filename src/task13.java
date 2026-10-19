import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int x = 1000; x >= 0; x--) {
            long value = (long) a * x * x * x + (long) b * x * x + (long) c * x + d;
            if (value == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
