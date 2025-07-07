import java.util.Scanner;

public class SumOfAdjacentDistance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int diff,sum=0;
        for(int i=0;i<n-1;i++){
                diff=a[i]-a[i+1];
            if (diff < 0) {
                diff=-diff;
            }

                sum=sum+diff;
        }
        System.out.println(sum);
    }
}
