import java.util.Scanner;
public class Methods6{
  public static int l(String s){
    if (s.length() > 10){return 1;}
    return 0;
  }
  public static String i(){
    Scanner cin = new Scanner(System.in);
    System.out.println("Input string:");
    return cin.nextLine();
  }
  public static void o(int i){
    System.out.println("Strings with length greater than 10: s" + i);
  } 
  public static void main(String[] args){
    String s1,s2,s3,s4;
    s1 = i();
    s2 = i();
    s3 = i();
    s4 = i();
    
    int i1,i2,i3,i4;
    i1 = l(s1);
    i2 = l(s2);
    i3 = l(s3);
    i4 = l(s4);
    
    o(i1+i2+i3+i4);
  }
}