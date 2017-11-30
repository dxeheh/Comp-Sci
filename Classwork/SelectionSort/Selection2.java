import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class Selection2{
  
  String[] original;
  String[] sorted;
  
  public Selection2() throws Exception{
    System.out.println("enter file path:");
    original = i(new Scanner(System.in).nextLine());
    sorted = s(original);
  }
  
  public String[] s(String[] o){
    String[] a = o.clone();
    for (int i=0; i<a.length-1; i++) {
     for (int j=i+1; j<a.length; j++) {
        if (a[i].compareTo(a[j]) > 0) {
           String temp=a[j];
           a[j]=a[i];
           a[i]=temp;
        }
     }
  }
    return a;
  }
  
  public String[] i(String p) throws Exception{
    Scanner s = new Scanner(new File(p));
    String[] a = new String[60];
    for (int i = 0; i < 60; i++) a[i] = s.nextLine();
    return a;
  }
  
  public void o(){
    System.out.println(Arrays.toString(original));
    System.out.println(Arrays.toString(sorted));
  }
  
  public static void main(String args[]) throws Exception{
    Selection2 c = new Selection2();
    c.o();
  }
}