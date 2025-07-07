package Logic;

import java.util.*;
public class Happy_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum,rem,y=1;
        System.out.println("Enter the n value: ");
        int x=sc.nextInt();
        sum=10;
        while(sum>=10){
            sum=0;
            while(x!=0){
                rem=x%10;
                sum=sum+rem*rem;
                x=x/10;
            }
            x=sum;
            if(sum<=10){
                sum=sum*sum;
                x=sum;
            }

        }
        if(sum==y){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }
        sc.close();

    }
}
