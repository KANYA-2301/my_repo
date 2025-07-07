import java.util.Scanner;

public class GiftHampersToWinners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum=a[i]-a[j];
                if(sum<0){
                    sum=-sum;
                }
                if(sum==13){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("count:"+count);
        }
        else{
            System.out.println("no lucky customers found");
        }

    }
}
