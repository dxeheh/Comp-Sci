import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Selection4{
  
  int[] array;
  
  public Selection4() throws Exception{
    System.out.println("enter file path:");
    array = i(new Scanner(System.in).nextLine());
    s();
    o();
  }
  
  public int[] i(String p) throws Exception{
    Scanner s = new Scanner(new File(p));
    int[] a = new int[1000];
    for (int i = 0; i < a.length; i++) a[i] = s.nextInt();
    return a; 
  }
  
  public void s(){
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if (array[j] < array[i]){
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
  
  public void o() throws Exception{
    System.out.println("enter output folder:");
    BufferedWriter b = new BufferedWriter(new FileWriter(new Scanner(System.in).nextLine() + "sorted.txt"));
    for (int i = 0; i < array.length; i++){
      b.write(Integer.toString(array[i]));
      b.newLine();
    }
    b.flush();  
    b.close(); 
  }
  public static void main(String args[]) throws Exception{
    Selection4 s4 = new Selection4();
  }
}