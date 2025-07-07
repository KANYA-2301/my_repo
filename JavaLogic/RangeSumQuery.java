import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        if(n>=0 && n<m && m<=9999) {
            for (int i = n; i <= m; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
