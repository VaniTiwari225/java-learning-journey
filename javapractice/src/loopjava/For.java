//to print numbers from 1 to 50
package loopjava;
import java.util.*;
public class For {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            System.out.println(i);
        }
    }

}

//to print odd numbers from 1 to 50
class Oddloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=-1;i<n;i=i+2){
          System.out.println(i);
        }
        }
    }

//to print even numbers from 1 to 50
class Evenloop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=50;i=i+2){
            System.out.println(i);
        }
    }
}
