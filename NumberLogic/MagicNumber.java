package Logic;

import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int n=sc.nextInt();
        
        int sum=0,r,s=0,rev,digit=0,x;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
            
        }

        int temp=sum;
        while(temp>0){
            x=temp%10;
            digit++;
            temp=temp/10;
        }
        int t=sum;
        for(int i=1;i<=digit;i++){
            rev=t%10;
            s=s+rev;
            t=t/10;

        }
        System.out.println(s);
        sc.close();

    }
}