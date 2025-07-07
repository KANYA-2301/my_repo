package Logic;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int n = s.length();
        String sum = "";

        for (int i=n-1; i >=0; i--) {
            sum = sum + s.charAt(i);
        }
        System.out.println(sum);
        if(s.equals(sum)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
