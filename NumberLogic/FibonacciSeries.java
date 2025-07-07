package Logic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        int f0=0,f1=1,f3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int count =0;
        while(count!=n) {
            f3 = f0 + f1;
            f0 = f1;
            f1 = f3;
            count++;
            System.out.print(f3 + "\t");

        }
    }
}
