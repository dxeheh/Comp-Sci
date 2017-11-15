import java.util.Arrays;
public class Recurse4 {
  
  public static int t(int[] array, int s){
    if(s>0) return Math.max(array[s], t(array, s-1));
    return array[0];
  }
  
  public static void main(String[] args){ 
    int[] array = new int[15];
    for(int i=0;i<array.length;i++){array[i] = (int)(Math.random()*100 + 1);}
    System.out.println(Arrays.toString(array));
    System.out.println(t(array, array.length-1));
  }
}
