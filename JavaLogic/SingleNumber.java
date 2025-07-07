import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    a[i]=0;
                    a[j]=0;
                    break;

                }
            }
        }
        for(int x:a){
            if(x>0) {
                System.out.println(x);
            }
        }
    }
}
