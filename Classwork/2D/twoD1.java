import java.util.Scanner;
import java.util.Arrays;
public class twoD1{
  
  int[][] original;
  int[][] added;
  
  public twoD1(){
    original = new int[3][4];
    added = new int[3][4];
    for(int i=0;i<original.length;i++){
      for(int j=0;j<original[0].length;j++){
        original[i][j] = i(); 
      }
    }
    c();
    o();
  }
  
  public int i(){return new Scanner(System.in).nextInt();}
  public void c(){
    for(int i=0;i<added.length;i++){
      for(int j=0;j<added[0].length;j++){
        added[i][j] = original[i][j] + 10; 
      }
    }
  }
  public void o(){
    System.out.println("Array #1\n========");
    System.out.println(Arrays.deepToString(original).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    System.out.println("Array #2\n========");
    System.out.println(Arrays.deepToString(added).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
  }
  public static void main(String args[]){
    twoD1 d = new twoD1();
  }
}