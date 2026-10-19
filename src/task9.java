import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zeros = zeros + 1;
            }
        }
        System.out.println(zeros);
    }
}
