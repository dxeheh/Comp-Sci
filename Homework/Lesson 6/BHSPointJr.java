import java.awt.Color;
public class BHSPointJr extends BHSPoint {
  private Color myColor;
  
  public BHSPointJr() {
    super(0,0);
    myColor = Color.BLUE;
  }
  
  public BHSPointJr(int x, int y, Color color){
    super(x,y);
    myColor = color;
  }
  
  public int getQuadrant(){
   if (getX() == 0 && getY() == 0) return 0;
   if (getY() == 0) return 5;
   if (getX() == 0) return 6;
   if (getX() < 0){
     if (getY() < 0) return 3;
     return 2;
   }
   if (getY() < 0) return 4;
   return 1;
  }
  
  public boolean isGreaterThan(BHSPointJr p){return (Math.hypot(getX(), getY()) > Math.hypot(p.getX(), p.getY()));}
  public boolean isLessThan(BHSPoint p){return (Math.hypot(getX(), getY()) < Math.hypot(p.getX(), p.getY()));}
  
  public boolean equals(Object o){
    if (!(o instanceof BHSPoint)) return false;
    if (getX() == ((BHSPoint)o).getX() && getY() ==((BHSPoint)o).getY()) return true;
    return false;
  }
  
  public String toString(){return String.format("%sColor    : red = %d, green = %d, blue = %d", super.toString(), myColor.getRed(), myColor.getGreen(), myColor.getBlue());}
}
