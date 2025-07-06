package Array;

import java.util.Scanner;

public class DuplicateElementInArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int k = 0; k < j; k++) {
                    if (a[i] == temp[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[j++] = a[i];
                }
            }

            System.out.print("Output: {");
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i]);
                if (i < j - 1) System.out.print(", ");
            }
            System.out.println("}");
        }
}
