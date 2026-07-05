package strings;
public class Stringbuilder {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("vani");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
    //change a character
    sb.setCharAt(0,'p');
    System.out.println(sb);
    //insert a character
    sb.insert(0,'a');
    System.out.println(sb);
    //delete something in the string
    sb.delete(2,4);
    System.out.println(sb);
}
}