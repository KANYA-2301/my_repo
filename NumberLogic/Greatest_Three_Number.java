package Logic.NumberLogic;//DAY-1
import java.util.*;
public class Greatest_Three_Number {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the First value:");
        int num1=obj.nextInt();
        System.out.println("Enter the Second value:");
        int num2=obj.nextInt();
        System.out.println("Enter the Third value:");
        int num3=obj.nextInt();
        if((num1>num2)&&(num1>num3)){
            System.out.println("num1 is greater");
        }
        else if(num2>num3){
            System.out.println("num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }

        obj.close();

    }
}
