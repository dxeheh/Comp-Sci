import java.util.Arrays;
import java.util.Scanner;

public class Selection3{
  
  int[] array;
  
  public Selection3(){
   i();
   i2();
   s();
   o();
  }
  
  public void i(){
   System.out.println("how many ints?");
   array = new int[new Scanner(System.in).nextInt()];
  }
  
  public void i2(){
    Scanner s = new Scanner(System.in);
    for (int i=1;i<=array.length;i++){
     System.out.printf("int #%d: ", i);
     array[i-1] = s.nextInt();
     System.out.println();
    }
  }
  
  public void s(){
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[j] < array[i]){
         int temp = array[j];
         array[j] = array[i];
         array[i] = temp;
        }
      }
    }
  }
  
  public void o(){
    System.out.println(Arrays.toString(array));
  }
  
  public static void main(String args[]){
    Selection3 s3 = new Selection3();
  }
}