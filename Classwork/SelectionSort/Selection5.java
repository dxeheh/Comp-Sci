import java.util.Scanner;
public class Selection5{
  
  String original;
  char[] c;
  String out;
  
  public Selection5(){
    i();
    s();
    s2();
    o();
  }
  
  public void i(){
    original = new Scanner(System.in).nextLine();
    c = original.toCharArray();
  }
  
  public void s(){
    for (int i=0;i<c.length-1;i++){
      for (int j=i+1;j<c.length;j++){
        if (Character.compare(c[i], c[j]) > 0){
         char temp = c[j];
         c[j] = c[i];
         c[i] = temp;
        }
      }
    }
  }
  
  public void s2(){out = new String(c);}
  
  public void o(){
    System.out.println(original);
    System.out.println(out);
  }
  
  public static void main(String args[]){
    Selection5 s5 = new Selection5();
  }
}