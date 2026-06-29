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



