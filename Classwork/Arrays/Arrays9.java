import java.io.FileReader;
import java.util.Scanner;
public class Arrays9 {
  public static int[] i() throws Exception{
    FileReader f = new FileReader("ints.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [9];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
  public static int c(int[] l){
    
  }
  public static void o(int[] o, int r){
  for (int x : o){System.out.print(x + " ");}
    System.out.print("\n");
  }
  System.out.println(r);
  public static void main(String[] args) { 
    
  }
}
