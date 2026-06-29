 //to create a class to perform basic arithmetic operations using variables
package basic;
public class Calc{
    public static void main(String[] args){
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println("sum of two numbers is"+sum);
        int diff=b-a;
        System.out.println("difference of two numbers is"+diff);
        int multiplication=a*b;
        System.out.println("multiplication of two numbers is"+multiplication);
        int ans=(a*b)/(a-b);
        System.out.println(ans);
        double c=7.8;
        double d=2.0;
        double Sum=c+d;
        System.out.println(Sum+"sum of c and d");
        float r=89;
        float j=80;
        float Diff=r-j;
        System.out.println(Diff+"difference of r and j");
        //here i didn't use scanner class so the values are fixed and i cannot change them;
    }
}

