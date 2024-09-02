import java.util.Scanner;

class Number{
    String r;
    public String result(int n)
    {
        if(n%2==0){
            r="even";
            return r;
        }
        else{
            r="odd";
            return r;
        }
    }

}
public class oddoreven {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num1= scanner.nextInt();
        Number num=new Number();
        String x=num.result(num1);
        System.out.println(x);
        scanner.close();
        
    }
    
}
