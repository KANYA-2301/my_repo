import java.util.Scanner;

public class OnlineGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        int t=fact;
        int r,count=0;
        while(t>0){
            r=t%10;
            if(r==0){
                count++;
            }
            else{
                break;
            }
            t=t/10;
        }
        System.out.println(count);
    }
}
