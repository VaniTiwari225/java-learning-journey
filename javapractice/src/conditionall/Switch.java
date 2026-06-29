//make a calculator using switch
package conditionall;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int calc=sc.nextInt();
        switch(calc){
         case 1:
            System.out.println("addition :"+(a+b));
            break;
        case 2:
            System.out.println("substraction :"+(a-b));
            break;
        case 3:
            System.out.println("multiplication :"+a*b);
            break;
        case 4:
            System.out.println("dIvision :"+a/b);
            break;
        default:System.err.println("invalid");
        break;
        }
    }

}