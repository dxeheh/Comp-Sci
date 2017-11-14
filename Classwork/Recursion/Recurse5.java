import java.util.Scanner;
public class Recurse5 {
  
  public boolean p(String s){
    if (s.length() == 0 || s.length() == 1) return true;
    if (s.charAt(0) ==s.charAt(s.length()-1)) return p(s.substring(1, s.length()-1));
    return false;
  }
  
  public static void main(String[] args) { 
    Recurse5 r = new Recurse5();
    if (r.p(new Scanner(System.in).nextLine().toLowerCase())) System.out.println("yes");
    else System.out.println("no");
  }
}
