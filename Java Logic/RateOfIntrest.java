package Task;

import java.util.Scanner;

public class RateOfIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        String gender= sc.next();

        if((gender.equals("Female"))&&(age>=1 && age<58)){
            System.out.println("the percentage of interest is 8.2%. ");
        }
        else if((gender.equals("Female"))&&(age>=59 && age<100)){
            System.out.println(", the percentage of interest is 9.2%. ");
        }
        else if((gender.equals("Male"))&&(age>=1 && age<=58)){
            System.out.println("the percentage of interest is 8.4%. ");
        }
        else{
            System.out.println("the percentage of interest is 10.5%. ++++");
        }
    }
}
