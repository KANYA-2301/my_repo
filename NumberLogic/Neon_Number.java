import java.util.Scanner;

public class Neon_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r;
        int x=n*n;
        while(x>0){
            r=x%10;
            sum=sum+r;
            x=x/10;
        }
        if(sum==n){
            System.out.println("neon number");
        }
        else {
            System.out.println("not a neon number");
        }
    }
}
