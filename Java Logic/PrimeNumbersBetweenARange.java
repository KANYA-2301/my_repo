package Task;

import java.util.Scanner;

public class PrimeNumbersBetweenARange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int startingNumber=sc.nextInt();
        int endingNumber=sc.nextInt();
        for(int i=startingNumber;i<=endingNumber;i++) {
            int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count==2) {
                System.out.print(i+" ");
            }
        }

    }
}
