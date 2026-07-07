//Convert a string to uppercase
package strings;
import java.util.*;
public class Uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
         String upper = str1.toUpperCase();
         System.out.println(upper);
    }
}

//convert a string to lowercase
class Lowercase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String lower=str.toLowerCase();
        System.out.println(lower);
    }
}