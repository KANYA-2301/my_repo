import java.util.Scanner;

public class EnergyinScienceLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intialEnergy= sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        if((intialEnergy>=-106 && intialEnergy<=106) && (rate>=-106 && rate<=106)&&(time>=0 && time<=100)){
            for(int i=1;i<time;i++){
                intialEnergy=intialEnergy*rate;
            }
            System.out.println(intialEnergy);
        }
        else{
            System.out.println("out of bound");
        }
    }
}
