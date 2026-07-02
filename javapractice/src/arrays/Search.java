//take an inpout from the user.Search for a given number x and print the index at which it occurs
package arrays;
import java.util.*;
class Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=1;i<number.length-1;i++){
            if(number[i]==x){
                System.out.println("x occurs at index :"+i);
            }
        }
    }
}