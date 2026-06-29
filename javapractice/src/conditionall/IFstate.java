//check if a person is eligible to vote or not using nested if
package conditionall;
import java.util.*;

public class IFstate {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    boolean hasvoterid=true;
    if(age>=18){
        if(hasvoterid=true){
            System.out.println("eligible to vote");
        }
    }else{
        System.out.println("not eligible to vote");
    }
}
}


//check if a letter is vowel or consonent
class Checkletter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a' & ch=='e' &ch=='i' &ch=='o' &ch=='u'
         & ch=='A' &ch=='E' &ch=='I' & ch=='O' &ch=='U'){
         System.out.println("vowel");
        }else{
            System.out.println("consonent");
        }
    }
}

//check if a letter if uppercase or lowercase or special character
class Check{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' &ch<='z'){
           System.out.println("lowercaffse"); 
        }else if(ch>='A' & ch<='Z'){
            System.out.println("uppercase");
        }else{
            System.out.println("special character");
        }
    }
}


