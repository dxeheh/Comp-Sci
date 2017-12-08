import java.util.Scanner;
import java.util.Arrays;
public class twoD5{
  
  int[][] one;
  int[][] two;
  int[][] end;
  
  public twoD5(){
    one = new int[3][3];
    two = new int[3][3];
    end = new int[3][3];
    
    for(int i=0;i<one.length;i++){ 
      for(int j=0;j<one[0].length;j++){ 
        one[i][j] = i();  
      } 
    }
    for(int i=0;i<two.length;i++){ 
      for(int j=0;j<two[0].length;j++){ 
        two[i][j] = i();  
      } 
    } 
    c();
    o();
  }
  
  public int i(){return new Scanner(System.in).nextInt();}
  
  public void c(){
    for(int i=0;i<end.length;i++){ 
      for(int j=0;j<end[0].length;j++){ 
        end[i][j] = one[i][j] + two[i][j];  
      } 
    }
  }
  
  public void o(){
    System.out.println(Arrays.deepToString(one).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", "")); 
    System.out.println("plus"); 
    System.out.println(Arrays.deepToString(two).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    System.out.println("equals"); 
    System.out.println(Arrays.deepToString(end).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    
  }
  
  public static void main(String args[]){
    twoD5 d = new twoD5();
  }
}