//Write a program to input and display a character array.
package characterarrays;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arrays=new char[5];
       for(int i=0;i<5;i++){
        arrays[i]=sc.next().charAt(0);
       }
       for(int i=0;i<5;i++){
        System.out.print(arrays[i]);
       }
    }
}