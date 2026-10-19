import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int koren = (int) Math.sqrt(i);
            if (koren * koren == i) {
                System.out.print(i + " ");
            }
        }
    }
}
