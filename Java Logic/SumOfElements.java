package Array;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        boolean skip=false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int num : a) {
            if (num == 6) {
                skip = true;
            }
            if (!skip) {
                sum += num;
            }
            if (skip && num == 7) {
                skip = false;
            }
        }
        System.out.println( sum);
    }
}
