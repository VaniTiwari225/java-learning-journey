// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

package strings;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String result=" ";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='e'){
                result+='i';
            }else{
                result+=str1.charAt(i);
            }
        }
        System.out.println(result);
    }
}