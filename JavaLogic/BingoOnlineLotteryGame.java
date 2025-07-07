import java.util.Scanner;

public class BingoOnlineLotteryGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int mul,temp=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                mul=a[i]*a[j];
                if(mul>temp){
                    temp=mul;
                }
            }
        }
        System.out.println(temp);
    }
}
