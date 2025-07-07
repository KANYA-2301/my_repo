import java.util.Scanner;

public class SpecialDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of an array:");
        int n = sc.nextInt();
        System.out.println("Discount value:");
        int d = sc.nextInt();
        System.out.println("Enter the array value:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean b=true;
            if(a[i] < 0) {
                b = false;
            }
            if (b){
                if (d % a[i] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
