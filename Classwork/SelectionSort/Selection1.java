import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class Selection1{
  int[] original;
  int[] sorted;
  
  public Selection1() throws Exception{
    original = i();
    sorted = s(original);
  }
  
  public int[] s(int[] o){
    int[] a = o.clone();
    for (int i=0; i<a.length-1; i++) {
     for (int j=i+1; j<a.length; j++) {
        if (a[i] > a[j]) {
           int temp = a[j];
           a[j] = a[i];
           a[i] = temp;
        }
     }
  }
    return a;
  }
  
  public int [] i() throws Exception{
    Scanner s = new Scanner(new File("h:/1000ints.txt"));
    int[] a = new int[30];
    for (int i = 0; i < a.length-1; i++) a[i] = s.nextInt();
    return a;
  }
  
  public void o(){
    System.out.println(Arrays.toString(original));
    System.out.println(Arrays.toString(sorted));
  }
  
  public static void main(String args[]) throws Exception{
    Selection1 c = new Selection1();
    c.o();
  }
}