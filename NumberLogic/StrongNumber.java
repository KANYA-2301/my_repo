package Logic;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r;
        int temp=n;
        while(n>0) {
            r=n%10;
            int fact = 1;
            for (int i = 1; i <=r; i++) {
                fact =fact*i;
            }
            sum=sum+fact;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("sn");
        }
        else{
            System.out.println("not");
        }


    }
}
