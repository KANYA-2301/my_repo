import java.util.Scanner;

public class AreaOfTheTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The base and height of 1st Triangle:");
        int b1= sc.nextInt();
        int h1=sc.nextInt();
        System.out.println("The base and height of 1st Triangle:");
        int b2= sc.nextInt();
        int h2=sc.nextInt();
        float A1,A2;
        if((0<=b1)&&(0<=h1)&&(0<=b2)&&(0<=h2)&&(b1<=109)&&(h1<=109)&&(b2<=109)&&(h2<=109)){
            A1=(b1*h1)/2;
            A2=(b2*h2)/2;
            if (A1 > A2) {
                System.out.printf("%.2f", A1);
            } else {
                System.out.printf("%.2f", A2);
            }
        }
        else{
            System.out.println("out of bound");
        }
    }
}
