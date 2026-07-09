//Print the character from an ASCII value
package ascii;
import java.util.*;
public class Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ascii=sc.nextInt();
        System.out.println("character :"+(char)ascii);
    }
}