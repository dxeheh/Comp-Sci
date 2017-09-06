import java.util.Scanner;
public class Methods9 {
  public static String i(){
    Scanner cin = new Scanner(System.in);
    System.out.println("input string:");
    return cin.nextLine();
  }
  public static void o(String s, String su, String sl){
    System.out.println("Original: " + s);
    System.out.println("UPPERCASE: " + su);
    System.out.println("lowercase: " + sl);
  }
  public static char u(char c){return Character.toUpperCase(c);}
  public static char l(char c){return Character.toLowerCase(c);}
  public static void main(String[] args) { 
    String s = i();
    char[] c = s.toCharArray();
    String su = "";String sl = "";
    for (char x:c){su += u(x);sl += l(x);}
    o(s, su, sl);
  }
}
