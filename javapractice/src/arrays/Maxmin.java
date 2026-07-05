//find the maximum and minimum element
package arrays;
import java.util.*;
public class Maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int maxarray=0;
        for(int i=0;i<size;i++){
            if(maxarray<array[i]){
                maxarray=array[i];
            }
        }
        System.out.println( "maxmimum element in the array is :"+maxarray);
    }
}