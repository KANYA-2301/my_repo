import java.util.Scanner;

public class NewYearDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,sum=0;
//        if(n>0 && n<=109){
            while(n>0){
               r=n%10;
               if(r%2!=0){
                   sum=sum+r;
               }
               n=n/10;
            }
            System.out.println(sum);
//        }
//        else{
//            System.out.println("out of bound");
//        }

    }
}
