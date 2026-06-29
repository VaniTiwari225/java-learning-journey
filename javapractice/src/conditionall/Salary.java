//calculate salary of a employee
package conditionall;
import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    double salary=sc.nextDouble();
        double experience=sc.nextDouble();
        double bonus;
        if(experience<5){
            bonus=0.5*salary;
            System.out.println(bonus);
        }else{
            bonus=0.10*salary;
            System.out.println(bonus);
        }
        double totalsalary=bonus+salary;
        System.out.println(totalsalary);;
    }

}