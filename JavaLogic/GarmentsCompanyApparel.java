import java.util.Scanner;

public class GarmentsCompanyApparel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int max=1;
        for(int i=0;i<n;i++) {
            a[i]= sc.nextInt();
            if(a[i]>max){
                max=a[i];
            }

        }
        int r_v,count=0;
            for (int i = 1; i < max / 4; i++) {
                r_v = i * i;
                for (int j = 0; j < n; j++) {
                    if (r_v == a[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);

    }
}
