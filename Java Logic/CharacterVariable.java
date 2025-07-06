package Task;

import java.util.Scanner;

public class CharacterVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        char x;
        if (c <= 'a' && c >= 'z') {
            x= (char) (c+32);
            System.out.println(x);
        }
        else{
            x= (char) (c-32);
            System.out.println(x);
        }
    }
}
