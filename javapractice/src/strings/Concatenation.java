//add two strings and print the length of the string
package strings;
import java.util.*;
public class Concatenation {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String firstname=sc.next();
   String lastname=sc.next();
   String fullname=firstname+" "+lastname;
   System.out.println(fullname);
   System.out.println(fullname.length());
   //print all characters of the string
   for(int i=0;i<fullname.length();i++){
System.out.println(fullname.charAt(i));
   }
}
}