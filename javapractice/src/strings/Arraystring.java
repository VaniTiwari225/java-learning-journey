//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package strings;
import java.util.*;
public class Arraystring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] array=new String[size];
        int totlength=0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            totlength=array[i].length();
        }
        System.out.println(totlength);
    }
}