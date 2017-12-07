import java.util.Arrays;
public class twoD3{
  
  int[][] nums;
  
  public twoD3(){
    nums = new int[5][2];
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[0].length;j++){
        nums[i][j] = i(); 
      }
    }
    o();
  }
  
  public int i(){
    return (int)(Math.random()*50 + 1);
  }
  
  public int c(){
    int t = 0;
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums[0].length;j++){
        if(nums[i][j] > nums[0][0])t++;
      }
    }
    return t;
  }
  
  public void o(){
    System.out.println(Arrays.deepToString(nums).replace("], ", "\n").replace("[[", "").replace("]]", "").replace(",", "\t").replace("[", ""));
    System.out.println("Larger than first element: "+c());
  }
  
  public static void main(String args[]){
    twoD3 d = new twoD3();
  }
}