package Task;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                x=x+1;
                System.out.print(x+" ");
            }
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
