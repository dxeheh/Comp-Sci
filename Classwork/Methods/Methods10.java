import java.util.Scanner;
public class Methods10 {
  public static double i(String s){
    Scanner i = new Scanner(System.in);
    System.out.println("input " + s + ": ");
    return i.nextDouble();
  }
  public static void o(double l, double w, double a, double d){
    System.out.printf("Length   : %1$.4f\n", l);
    System.out.printf("Width    : %1$.4f\n", w);
    System.out.printf("Area     : %1$.4f\n", a);
    System.out.printf("Diagonal : %1$.4f\n", d);
  }
  public static double a(double l, double w){
    return l*w;
  }
  public static double d(double l, double w){
    return Math.sqrt(l*l+w*w);
  }
  public static void main(String[] args) { 
    double l,w;
    l = i("length");
    w = i("width");
    o(l,w,a(l,w),d(l,w));
  }
}
