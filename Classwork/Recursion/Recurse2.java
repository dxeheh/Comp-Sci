import java.util.Scanner;
public class Recurse2 {
  
  public int pow(int n, int p){
    if (n == 0 || p == 0)return 1;
    return n * pow(n, p-1);
  }
  
  public static void main(String[] args) { 
    Recurse2 r = new Recurse2();
    System.out.println(r.pow(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
  } 
}
