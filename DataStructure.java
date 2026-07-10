
import java.util.ArrayList;
import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read initial number of elements
        int N = sc.nextInt();
        
        // Create ArrayList and add initial elements
        ArrayList<Integer> L = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        
        // Read number of queries
        int Q = sc.nextInt();
        
        // Process each query
        for (int n = 0; n < Q; n++) {
            String query = sc.next();
            
            if (query.equals("Insert")) {
                int x = sc.nextInt();  // index to insert at
                int y = sc.nextInt();  // value to insert
                L.add(x, y);
            } else if (query.equals("Delete")) {
                int x = sc.nextInt();  // index to delete
                L.remove(x);
            }
        }
        
        // Print the modified list as space-separated integers
        for (int p = 0; p < L.size(); p++) {
            System.out.print(L.get(p));
            if (p != L.size() - 1) {
                System.out.print(" ");
            }
        }
        
        sc.close();
    }
}
