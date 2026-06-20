
import java.io.IOException;
import java.util.Scanner;

public class Java1d {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner((System.in));

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            a[i] = ai;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        scanner.close();
    }
}
