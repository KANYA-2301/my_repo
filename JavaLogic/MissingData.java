import java.util.Scanner;
public class MissingData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a=s1.length();
        int b=s2.length();
        if(a==b){
            System.out.println("NA");
        }
        else {
            for (int j = 0; j<b; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    System.out.println(j);
                }
            }
        }
        if(s1.charAt(a-1)!=s2.charAt(b-1)){
            System.out.println(s1.charAt(a-1));
        }
    }
}
