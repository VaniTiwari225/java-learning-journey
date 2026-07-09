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

//print ascii values from A to Z
class Values{
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.println(" Ascii value of " + ch+"="+(int)ch);
        }
    }
}