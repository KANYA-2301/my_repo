package Logic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year:");
        int n=sc.nextInt();
        if(((n%4==0)&&(n%100!=0)||(n%400==0))){
            System.out.println("LeapYear");
        }
        else{
            System.out.println("Not a Leap Year");
        }

    }
}
