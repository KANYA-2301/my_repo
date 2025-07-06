package Array;

import java.util.Scanner;

public class ASCIIValuesOfACharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        for(int i=33;i<127;i++){
            c=(char)i;
            System.out.print(c+" ");
        }
    }
}
