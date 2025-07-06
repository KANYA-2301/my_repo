package Task;

import java.util.Scanner;

public class AlphabeticalOrderOfCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st character");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter 2nd character");
        char c2 = sc.next().charAt(0);

        if(c1<c2){
            System.out.println(c1+","+c2);
        }
        else{
            System.out.println(c2+""+c1);
        }
    }
}
