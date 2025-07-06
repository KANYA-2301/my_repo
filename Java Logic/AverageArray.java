package Array;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int avg,total=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            total=total+a[i];
        }
        avg=total/n;
        System.out.println(avg);
    }
}
