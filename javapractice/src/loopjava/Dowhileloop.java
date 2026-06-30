//print n numbers
package loopjava;
import java.util.*;
public class Dowhileloop {
    public static void main(String[] args) {
        
   Scanner sc=new Scanner(System.in) ;
   int n=sc.nextInt();
   int i=1;
   do{
    System.out.println(i);
    i++;
   }while(i<=n);
}
}


//print factorial of n numbers using do while loop
class Newdowhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int i=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=n);
        System.out.println(fact);
    }
}

//print reverse of a given number using do while loop
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int i=0;
        do{
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
            i++;
        }while(i<=n);
        System.out.println(reverse);
    }
}

//print number of digits in a number
class count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            count=1;
        }else{
            do{
                count++;
                n=n/10;
            }while(n>0);
            System.out.println(count);
        }
    }
}