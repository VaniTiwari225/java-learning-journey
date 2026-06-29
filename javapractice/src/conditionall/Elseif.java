//to display result of a student
package conditionall;
import java.util.*;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>70){
            System.out.println("grade A");
        }else if(marks >50){
        System.out.println("grade B");
        }else{
            System.out.println("fail");
        }
    }
}


