//print ascii value of a character
package ascii;
import java.util.*;
public class Asciivalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("ASCII value = "+(int)ch);
    }
}

//Print the character from an ASCII value
