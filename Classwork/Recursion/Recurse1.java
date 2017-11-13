import java.util.Scanner;
public class Recurse1 {
  
  public int mult(int n, int m){
    if (n == 0 || m == 0) return 0;
    else if (m<0) return - n + mult(n, m+1);
    else return n + mult(n, m-1);
  }
  
  public static void main(String[] args) { 
    Recurse1 r = new Recurse1();
    System.out.println(r.mult(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
  }
}
