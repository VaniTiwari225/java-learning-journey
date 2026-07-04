package strings;
import java.util.*;
public class Compare {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String first=sc.next();
    String second=sc.next();
    //compare the two strings
    //s1>s2=positive value
    //s1=s2=0
    //s2>s1=negative value
    if(first.compareTo(second)>0){
        System.out.println("string is +ve");
    }else if(first.compareTo(second)==0){
        System.out.println("strings are equal");
    }else{
        System.out.println("string is -ve");
    }
}
}