package Logic;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
        int rev=0;
        int rem;
        System.out.println("Enter the value:");
        int num=obj.nextInt();
        int temp=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;  //used to add a number
            num=num/10;     // used to delete a number
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        obj.close();

    }
}
