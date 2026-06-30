//print the sum of two numbers in such way that you can repeat the method as many times you want
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


//print subtract of two numbers
class Printsub{
    public static void main(String[] args) {
        int substraction=sub();
        System.out.println(substraction);
    }
    static int sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no. :");
        int a=sc.nextInt();
        System.out.println("enter the second no. :");
        int b=sc.nextInt();
        int sub=a-b;
        return sub;
    }
}