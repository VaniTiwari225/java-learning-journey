package characterarrays;
import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arrays=new char[5];
       for(int i=0;i<5;i++){
        arrays[i]=sc.next().charAt(0);
       }
       System.out.print(arrays.length);
    }
}
