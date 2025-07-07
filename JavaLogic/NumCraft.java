import java.util.Scanner;

public class NumCraft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int val1=num1%10;
        int val2=num2%10;
        int val3=num3%10,fourth,second,first;
        if(val1>val2 && val1>val3){
            fourth=val1;
        }else if(val2>val3){
            fourth=val2;
        }else{
            fourth=val3;
        }
        val1=(num1/10)%10;
        val2=(num2/10)%10;
        val3=(num3/10)%10;
        int third;
        if(val1<val2 && val1<val3){
            third=val1;
        }else if(val2<val3){
            third=val2;
        }else{
            third=val3;
        }
        val1=(num1/100)%10;
        val2=(num2/100)%10;
        val3=(num3/100)%10;
        if(val1>val2 && val1>val3){
            second=val1;
        }else if(val2>val3){
            second=val2;
        }else{
            second=val3;
        }
        val1=(num1/1000)%10;
        val2=(num2/1000)%10;
        val3=(num3/1000)%10;

        if(val1<val2 && val1<val3){
            first=val1;
        }else if(val2<val3){
            first=val2;
        }else{
            first=val3;
        }
        int ans=0;
        ans=(first*1000)+(second*100)+(third*10)+fourth;
        System.out.println(ans);
    }
}