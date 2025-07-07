import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //to find largest element
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {

                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {

                second = a[i];
            }
        }

        System.out.println("First largest: " + first);
        System.out.println("Second largest: " + second);


        //to find smallest element
        int first_s = Integer.MAX_VALUE;
        int second_s = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            if (a[i] < first_s) {

                second_s = first_s;
                first_s = a[i];
            } else if (a[i] < second_s && a[i] != first_s) {

                second_s = a[i];
            }
        }

        System.out.println("First largest: " + first_s);
        System.out.println("Second largest: " + second_s);


   }
}
