import java.util.Scanner;

public class OneTimePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int max=1,min=Integer.MAX_VALUE;
        for(int i=firstNumber;i<=secondNumber;i++){
            int temp=i;
            if(i<0){
                temp=-i;
            }
            int count=0;
            for(int j=2;j<=temp/2;j++) {
                if (temp % j == 0){
                    count++;
                }
            }
            if(count==0){
                if(i>max){
                    max=i;
                }
                if(i<min){
                    min=i;
                }
            }

        }
        System.out.println(max);
        System.out.println(min);
        int sum=min+max;
        if(sum<0){
            sum=-sum;
        }
        System.out.println(sum);

    }
}
