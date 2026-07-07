//Insert your name at the beginning of a sentence.
package strings;
import java.util.*;
public class Insertname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String name=sc.next();
        StringBuilder sb=new StringBuilder(sentence);
        sb.insert(0,name+" ");
        System.out.println(sb);
    }
}