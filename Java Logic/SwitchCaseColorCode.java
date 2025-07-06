package Task;

import java.util.Scanner;

public class SwitchCaseColorCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char c=sc.nextLine().charAt(0);
        switch(c){
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case '0':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid code");
        }












    }
}
