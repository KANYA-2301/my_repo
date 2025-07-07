public class LeftTriangle {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row+1;i++){

            for(int j=row+1;j<=row;j++){
                System.out.println();
                System.out.print("* ");
            }
            for(int j=row+1;j>=row;j--){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
