import java.util.Scanner;
import java.util.Arrays;
public class twoD6{
  
  int[][] array;
  
  public twoD6(){
    array = new int[4][8];
    for(int i=0;i<array.length;i++){ 
      for(int j=0;j<array[0].length;j++){ 
        array[i][j] = i();  
      } 
    }
    o();
  }
  
  public int i(){return new Scanner(System.in).nextInt();}
  
  public int c(){
    int r = array[0][0];
    for(int i=0;i<array.length;i++){ 
      for(int j=0;j<array[0].length;j++){ 
        if(array[i][j] > r)r=array[i][j]; 
      }
    }
    return r;
  }
  
  public void o(){
    System.out.println(Arrays.deepToString(array).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    System.out.println("largest: "+c());
  }
  
  public static void main(String args[]){
    twoD6 d = new twoD6(); 
  }
}