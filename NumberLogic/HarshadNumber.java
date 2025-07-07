package Logic;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        for(int i=1;i<=n;i++){
           int temp=i;
           int sum=0;
            while(temp>0) {
                r = temp % 10;
                sum = sum + r;
                temp = temp / 10;

            }
            if (i%sum == 0) {
                System.out.println("Harshad Number"+i);
            }
            else {
                System.out.println("Not a Harshad number"+i);
            }
        }
    }
}
