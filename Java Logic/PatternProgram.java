package Task;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0){
                    for( j=0;j<3;j++){
                        System.out.print(" ");
                    }
                    for(j=3;j<=3;j++){
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                }
            }
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
