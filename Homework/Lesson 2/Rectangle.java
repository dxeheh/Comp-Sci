/*----------------
 * Ryan Earll
 * Lesson 2, HW 1
 * ---------------*/

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
   return String.format("width     : %1.3f\nheight    : %1.3f\narea      : %1.3f\nperimeter : %1.3f", myWidth, myHeight, getArea(), getPerimeter());
  }
}
