package functions;
import java.util.*;
public class Printsum{
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no. :");
        int a=sc.nextInt();
        System.out.println("enter second no. :");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum :"+sum);
    }

}