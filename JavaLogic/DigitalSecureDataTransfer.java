import java.util.Scanner;

public class DigitalSecureDataTransfer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Character c=sc.next().charAt(0);
        int n=sc.nextInt();
        char x=(char)(c+n);
        System.out.println(x);

    }
}
