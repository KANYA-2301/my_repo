import java.util.Scanner;

public class ChristmasDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,sum1=0,sum2=0;

//        if((n>0)&&(n<=109)){
            while(n>0){
                r=n%10;
                if(r%2==0){
                    sum1=sum1+r;
                }
                else{
                    sum2=sum2+r;
                }
                n=n/10;
            }
//        }
        int x=sum1*sum2;
        System.out.println(x);
    }
}
