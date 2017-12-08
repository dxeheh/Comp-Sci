import java.util.Scanner;
import java.util.Arrays;
public class twoD4{
  
  int[][] nums;
  
  public twoD4(){
    nums = new int[4][4];
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[0].length;j++){
        nums[i][j] = i();
      }
    }
    o();
  }
  
  public int i(){return new Scanner(System.in).nextInt();}
  public void o(){
    System.out.println(Arrays.deepToString(nums).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    System.out.println("avg: "+c());
  }
  public double c(){
    int a = 0;
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[0].length;j++){
        a += nums[i][j];
      }
    }
    return a / 16.0;
  }
  public static void main(String args[]){
    twoD4 d =new twoD4();
  }
}