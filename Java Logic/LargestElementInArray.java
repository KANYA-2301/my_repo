package Array;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
       try{
           if (args.length != 9) {
               System.out.println("Please enter 4 integer numbers");
               return;
           }
           int[][] arr = new int[3][3];
           int k = 0;
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   arr[i][j] = Integer.parseInt(args[k++]);
               }
           }
           int max=arr[0][0];
           for(int i=0;i<3;i++){
               for(int j=1;j<3;j++){
                   if(arr[i][j]>max){
                       max=arr[i][j];
                   }
               }
           }
           System.out.println(max);

       }catch (NumberFormatException e) {
           System.out.println("Error: Please enter only valid integers.");
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Error: Insufficient arguments. Please provide exactly 4 integers.");
       } catch (Exception e) {
           System.out.println("Unexpected error: " + e.getMessage());
       }

    }
}
