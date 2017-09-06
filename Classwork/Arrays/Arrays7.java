import java.io.FileReader;
import java.util.Scanner;
public class Arrays7 {
   public static int[] i() throws Exception{
    FileReader f = new FileReader("Arrays7ints.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [12];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
  public static int[] c(int[] i){
     int l = i.length;
     int [] r = new int [l/2];
     int c = 0;
     for(int j=0;j<l;j+=2){
       r[c] = i[j] + i[j+1];
       c++;
     }
     return r;
   }
  public static void o(int[] o, int[] n){
    for (int x : o){System.out.print(x + " ");}
    System.out.print("\n");
    for (int x: n){System.out.print(x + " ");}
  }
  public static void main(String[] args) throws Exception { 
    int [] i = i();
    o(i, c(i));
  }
  
}