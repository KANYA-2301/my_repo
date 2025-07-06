package Logic;

import java.util.Scanner;

public class ToFindGivenNoIsPositiveNegativeZero {
    public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the  value:");
            int num=obj.nextInt();

            if(num==0){
                System.out.println("Zero ");
            }
            else if(num<0){
                System.out.println("Negative Number");
            }
            else{
                System.out.println("Positive Number");
            }
    }
}
