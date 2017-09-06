import java.util.Scanner;
public class Methods8 {
  public static double i(){
    Scanner cin = new Scanner(System.in);
    System.out.println("enter double: ");
    return cin.nextDouble();
  }
  public static void o(double d1, double d2, double d3, double a){
    System.out.println("you entered : " + d1 + " " + d2 + " " + d3);
    System.out.println("" + a + " is closer to " + d3);
  }
  public static double c(double d1, double d2, double d3){
    if ((d3-d1) < (d3-d2)){return d1;}
    return d2;
  }
  public static void main(String[] args) { 
    double d1,d2,d3;
    d1 = i();d2 = i();d3 = i();
    o(d1,d2,d3,c(d1,d2,d3));
  }
}
