import java.util.Scanner;

public class PooledCabServices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start_pt = sc.nextInt();
        int end_pt = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if ((a[i] >= start_pt) && (a[i] <= end_pt)) {
                System.out.println(a[i] + "");
            }
        }
    }
}
