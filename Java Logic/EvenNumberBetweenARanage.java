package Task;

import java.util.Scanner;

public class EvenNumberBetweenARanage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int startingNumber=sc.nextInt();
        int endingNumber=sc.nextInt();
        for(int i=startingNumber;i<=endingNumber;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
