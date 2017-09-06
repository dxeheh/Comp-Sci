import java.util.Scanner;
public class Methods7 {
  public static double i(){
    Scanner cin = new Scanner(System.in);
    System.out.println("enter leg:");
    return cin.nextDouble();
  }
  public static void o(double l1, double l2, double h){
    System.out.println("Leg1      : " + l1);
    System.out.println("Leg2      : " + l2);
    System.out.println("Hypotenuse: " + h);
  }
  public static double c(double l1, double l2){
    return Math.sqrt(l1*l1+l2*l2);
  }
  public static void main(String[] args) {
    double l1, l2;
    l1 = i();
    l2 = i();
    
    double h = c(l1, l2);
    o(l1, l2, h);
  }
}
