import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int count = 0;
        for (int x = 0; x <= 1000; x++) {
            if (x == e) {
                continue;
            }
            long value = (long) a * x * x * x + (long) b * x * x + (long) c * x + d;
            if (value == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
