package Task;

public class AdditionOfTwoIntegers {
    public static void main(String[] args) {
        String num1=args[0];
        String num2=args[1];
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int z=n1+n2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+z);
    }
}
