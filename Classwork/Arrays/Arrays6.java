import java.io.FileReader;
import java.util.Scanner;
public class Arrays6 {
  public static int[] i1() throws Exception{
    FileReader f = new FileReader("ints.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [10];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
  public static int[] i2() throws Exception{
    FileReader f = new FileReader("ints2.txt");
    Scanner i = new Scanner(f);
    int [] r = new int [10];
    for (int j=0;j<r.length;j++){
      r[j] = i.nextInt();
    }
    i.close();
    return r;
  }
  public static boolean t(int[] i1, int[] i2){
    if ((i1[0] == i2[0])&&(i1[9] == i2[9])){return true;}
    return false;
  }
  public static void o(int[] i1,int[] i2){
   System.out.println(t(i1, i2));
  }
  public static void main(String[] args) throws Exception { 
    o(i1(),i2());
  }
}
