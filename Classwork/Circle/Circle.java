public class Circle{
  
  private double radius;
  private String name;
  
  public Circle(){radius = 1;}
  
  public Circle(double r){
   radius = r; 
  }
  
  public double getRadius(){return radius;}
  public void setRadius(double r){radius = r;}
  
  public double getDiameter(){return radius*2;}
  public void setDiameter(double d){radius = d/2;}
  
  
}
