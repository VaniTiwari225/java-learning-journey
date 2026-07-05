//find the sum and average of elements of an array
package arrays;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<size;i++){
            sum=sum+array[i];
        }
        double avg=sum/array.length;
        System.out.println("sum is :"+sum);
        System.out.println("average is :"+avg);
    }
}