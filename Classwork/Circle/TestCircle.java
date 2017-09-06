public class TestCircle{ 
  public static void main(String[] args){ 
    Circle c = new Circle();
    Circle c2 = new Circle(4.5);
    System.out.println("radius: " + c.getRadius());
    System.out.println("radius: " + c2.getRadius());
    
    c.setDiameter(25);
    System.out.println("new radius: " + c.getRadius());
    System.out.println("diameter: " + c.getDiameter());
  }
}
