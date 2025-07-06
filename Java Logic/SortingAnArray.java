package Array;

import java.util.Scanner;
class Sorting{
    private int[] a;

    public void ascendingOrder(int a[], int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (a[j] < a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Sorted array : ascending order are");
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println(" ");
    }
    public void descendingOrder(int a[],int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (a[j] > a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Sorted array : descending order are");
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
public class SortingAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array values: ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Sorting s=new Sorting();
        s.ascendingOrder(a,n);
        s.descendingOrder(a,n);
    }
}
