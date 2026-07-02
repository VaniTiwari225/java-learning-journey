//print marks of a student
package arrays;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=45;
        marks[1]=76;
        marks[2]=34;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}


//take an inpout from the user.Search for a given number x and print the index at which it occurs
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

//Take an array of numbers as input and check if it is an array sorted in ascending order.
// { 1, 2, 4, 7 } is sorted in ascending order.
      // {3, 4, 6, 2} is not sorted in ascending order.
      class Order{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int[] numbers=new int[size];
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();
            }
            boolean isAscending=true;
            for(int i=0;i<numbers.length-1;i++){
                if(numbers[i]>numbers[i+1]){
                    isAscending=false;
                }
            }
            if(isAscending){
                    System.out.println("sorted in ascending order");
                }else{
                    System.out.println("sorted in descending order");
                }
        }
      }


