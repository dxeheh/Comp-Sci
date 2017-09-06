public class Rectangle {
  private double myWidth;
  private double myHeight;
  public Rectangle() { 
    myWidth = 1;
    myHeight = 1;
  }
  public Rectangle(double width, double height){
   myWidth = width;
   myHeight = height;
  }
  public double getArea(){
   return myWidth * myHeight; 
  }
  public double getPerimeter(){
   return myWidth*2 + myHeight*2;
  }
  public String toString(){
   return String.format("width     : %.3f\nheight    : %.3f\narea      : %.3f\nperimeter : %.3f", myWidth, myHeight, getArea(), getPerimeter());
  }
}
