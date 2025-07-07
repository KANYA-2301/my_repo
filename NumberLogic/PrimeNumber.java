package Logic;

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=obj.nextInt();
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false; // 0 and 1 are not prime numbers
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        obj.close();
    }
}
