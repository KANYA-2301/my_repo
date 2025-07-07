//to find the sum of digit
package Logic;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=obj.nextInt();
        int sum=0;
        int r;
        while(n!=0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        System.out.println(sum);
        obj.close();
    }
    
}
