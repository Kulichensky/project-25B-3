import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 != 0) {
            a = a + 1;
        }

        for (int i = a; i <= b; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
