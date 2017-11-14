import java.util.Scanner;
public class Recurse3 {
  
  public String rev(String s){
    if (s.equals("")) return "";
    return s.substring(s.length()-1) + rev(s.substring(0,s.length()-1));
  }
  
  public static void main(String[] args) { 
    Recurse3 r = new Recurse3();
    String s = new Scanner(System.in).nextLine();
    System.out.println(s);
    System.out.println(r.rev(s));
  }
}
