import java.util.Scanner;

public class BucketizeIds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=1,r;
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            if(r>max){
                max=r;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}
