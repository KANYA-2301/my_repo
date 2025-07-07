package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
    public static void main(String[] args){

                List<List<String>> list = new ArrayList<>();
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the size of string: ");
                int n = sc.nextInt();
                sc.nextLine(); // Consume the leftover newline

                System.out.println("Enter the Strings: ");
                String[] strs = new String[n];
                for (int j = 0; j < n; j++) {
                    strs[j] = sc.nextLine(); // Now it correctly reads the input strings
                }

                for(int z=0;z<strs.length;z++){
                    char[] charArray = strs[z].toCharArray(); // Convert string to character array
                    Arrays.sort(charArray);
                    strs[z] = new String(charArray);
                    System.out.println(strs[z]);
                }


                sc.close(); // Close Scanner to prevent resource leak
            }
        }


