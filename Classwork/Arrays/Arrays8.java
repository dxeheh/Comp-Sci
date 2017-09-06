import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays8 {
  public static int[] i1() throws Exception{
    FileReader f = new FileReader("Arrays8ints.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [10];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
  public static int[] i2() throws Exception{
    FileReader f = new FileReader("Arrays8ints2.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [10];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
    public static int[] c(int[] i1, int[] i2){
     int [] r = new int [i1.length + i2.length];
     int c=0;
      for(int x: i1){
        for(int y:i2){
          if (x==y){
           r[c] = x;
           c++;
          }
        }
      }
     return r;
   }
  public static void o(int[] o){
    for (int x : o){System.out.print(x + " ");}
    System.out.print("\n");
  }
  public static void main(String[] args) throws Exception { 
    o(c(i1(),i2()));
  }
}
