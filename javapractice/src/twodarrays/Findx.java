//search for the number x and print its index
package twodarrays;
import java.util.*;
public class Findx {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int r= sc.nextInt();
       int c= sc.nextInt();
       int[][] numbers = new int[r][c];
       for(int i=0; i<r; i++) {
           //columns
           for(int j=0; j<c; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       int x = sc.nextInt();
       for(int i=0; i<r; i++) {
           for(int j=0; j<c; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
   }
}
