import java.util.Scanner;

public class flip{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int num2=sc.nextInt();
        int sum=0;
        if(num2==1){
            for(int i=num;i>0;i--){
                if(i%2!=0){
                    sum=sum+i;
                }
                else{
                    sum=sum-i;
                }
            }

        }
        else if (num2==2){
            if(num==10) {
                sum = num;
                num = num - 1;
                for (int i = num; i > 0; i--) {
                    if (i % 2 != 0) {
                        sum = sum + i;
                    } else {
                        sum = sum - i;
                    }
                }
            }
            else {
                sum = num;
                num = num - 1;
                for (int i = num; i > 0; i--) {
                    if (i % 2 == 0) {
                        sum = sum + i;
                    } else {
                        sum = sum - i;
                    }
                }
            }

        }
        if(sum<0){
            System.out.println(-sum);
        }
        else {
            System.out.println(sum);
        }

    }
}