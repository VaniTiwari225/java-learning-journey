package arrays;
import java.util.*;
public class Stringarray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String[] str =new String[4];
       //input
       for(int i=0;i<4;i++){
        str[i]=sc.next();
       }
       //output
       for(int i=0;i<4;i++){
        System.out.println(str[i]);
       }
    }
}