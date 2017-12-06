import java.util.Scanner;
public class twoD2{
  
  String[][] array;
  String finalS;
  int count;
  
  public twoD2(){
    array = new String[4][3];
    finalS = "";
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        array[i][j] = i(); 
      }
    }
    c();
    o();
  }
  
  public String i(){return new Scanner(System.in).nextLine();}
  public void c(){
    for (String[] x : array)
    {
      for (String y : x)
      {
        if (y.toLowerCase().contains("ryan")){
         finalS += y+"\n";
         count++;
        }
      }
    }
  }
  public void o(){
    System.out.print(finalS);
    System.out.println("count: "+count);
  }
  public static void main(String args[]){
    twoD2 d = new twoD2();
  } 
}