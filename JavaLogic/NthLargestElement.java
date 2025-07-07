import java.util.Scanner;
class LargestNumber{
    public void largestelement(int k,int n,int a[]){
       int max=0;
        for(int i=1;i<=k;i++){
            max=0;
             int maxIndex=0;
            for(int j=0;j<n;j++) {
                if (a[j] > max) {
                    max=a[j];
                    maxIndex = j;
                }

            }
            a[maxIndex] = Integer.MIN_VALUE;
        }
        System.out.println(max);
    }
}
public class NthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        LargestNumber l=new LargestNumber();
        l.largestelement(k,n,a);
    }
}
