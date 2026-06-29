//print numbers from 1 to n
package loopjava;
import java.util.*;
public class While{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(i<=n){
    System.out.println(i);
    i++;
}
    }
}

//print sum of first n natural numbers
class Printsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            System.out.println(sum);
            i++;
            sum=sum+i;
        }
    }
}

//to find the number of digits in a number
class Countdigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            count=1;
        }else{
            while(n>0){
                count++;
                n=n/10;
            }
            System.out.println(count);
        }
    }
}

//to reverse a given number
class Reversenumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println(reverse);
    }
}

