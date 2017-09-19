import java.awt.Color;
public class CarSub extends Car{
  private Color color;
  private int miles;
  public CarSub(){ 
    super();
    color = Color.blue;
    miles = 0;
  }
  public CarSub(int w, String m, double p, Color c, int mi){
   super(w,m,p);
   color = c;
   miles = mi;
  }
  public String toString(){
    return super.toString() + String.format("Color  : %s\nMiles  : %d\n", color, miles);
  }
}
