import java.util.Scanner;
public class Recurse5 {
  
  public static boolean p(String s){
    if (s.length() == 0 || s.length() == 1) return true;
    if (s.charAt(0) ==s.charAt(s.length()-1)) return p(s.substring(1, s.length()-1));
    return false;
  }
  
  public static void main(String[] args) { 
    if (p(new Scanner(System.in).nextLine().toLowerCase())) System.out.println("yes");
    else System.out.println("no");
  }
}
