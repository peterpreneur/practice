
public class SubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            n = scanner.nextInt();
            scanner.nextLine(); // consume the rest of the line
        } while (n < 1 || n > 100); // loop until n is in range

    }
}
