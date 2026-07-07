package strings;
import java.util.*;
public class Appendd {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }
}
//Build a sentence using only append().
class Build{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb.append('i');
        System.err.println(sb);
    }
}