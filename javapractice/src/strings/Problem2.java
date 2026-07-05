// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “vanitiwariJava@gmail.com” ; username = “vanitiwarijava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

package strings;
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        String username=email.substring(0,14);
        System.out.println(username);
    }
}