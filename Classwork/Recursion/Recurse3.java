import java.util.Scanner;
public class Recurse3 {
  
  public static String rev(String s){
    if (s.equals("")) return "";
    return s.substring(s.length()-1) + rev(s.substring(0,s.length()-1));
  }
  
  public static void main(String[] args) { 
    String s = new Scanner(System.in).nextLine();
    System.out.println(s);
    System.out.println(rev(s));
  }
}
