import java.util.Scanner;

public class SmartSensorArrayAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int mode=sc.nextInt();
        int sum=0;
        int index=0;

        if(mode==1) {
            for (int i = 2; i < n; i++) {
              int count=0;
                for (int j = 2; j <=i/2; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if(count==0){
                    sum=sum+a[i];
                }
            }
            System.out.println(sum);
        }
        if (mode == 2) {
            for (int i = 0; i < n; i++) {
                int num = i;
                if (num <= 1) {
                    sum += a[i];
                    continue;
                }
                int count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count != 0) {
                    sum = sum + a[i];
                }
            }
            System.out.println(sum);
        }

    }
}
