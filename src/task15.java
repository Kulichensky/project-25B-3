import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        int count = 0;

        while (count < n) {
            for (int i = 0; i < num && count < n; i++) {
                System.out.print(num + " ");
                count = count + 1;
            }
            num = num + 1;
        }
    }
}
