public class BHSPoint{
 private int myX;
 private int myY;
 public BHSPoint(){
  myX = 0;
  myY = 0;
 }
 public BHSPoint(int x, int y){
  myX = x;
  myY = y;
 }
 public double getDistance(BHSPoint p){
  return getDistance(p.myX, p.myY);
 }
 public double getDistance(int x, int y){
  return Math.hypot((myX-x), (myY-y));
 }
 public String toString(){
  return String.format("Location : (%d,%d)", myX, myY);
 }
}
