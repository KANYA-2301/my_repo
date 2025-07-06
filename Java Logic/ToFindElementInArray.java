package Array;

import java.util.Scanner;

public class ToFindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("enter the array elements: ");
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the element to search: ");
        int searchElement= sc.nextByte();
        int index =-1;
        for(int i=0;i<n;i++){
            if(a[i]==searchElement){
                index=i;
                break;
            }
        }
        if(index>=0) {
            System.out.println("the search element is "+searchElement+" is found at  "+index);
        }
        else{
            System.out.println("the search element is "+searchElement+" is not found");
        }

    }
}
