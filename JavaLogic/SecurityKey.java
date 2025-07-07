import java.util.ArrayList;
import java.util.Scanner;
public class SecurityKey {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {
                   a.add(s.charAt(i));
                }
            }
        }
        int count=0;
        for(char x:a){
            count++;

        }
        System.out.println(count);
    }
}
