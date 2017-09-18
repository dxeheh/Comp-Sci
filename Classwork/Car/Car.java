public class Car {
  private int weight;
  private String make;
  private double price;
  
  public Car(){this(0,"none",0);}
  public Car(int w, String m, double p){
    weight = w;
    make = m;
    price = p;
  }
  
  public void setFeatures(int w, String m, double p){
    weight = w;
    make = m;
    price = p;
  }
  
  public int getWeight(){return weight;}
  public String getMake(){return make;}
  public double getPrice(){return price;}
  
  public String toString(){
    return String.format("Weight : %d\nMake   : %s\nPrice  : %1.2f\n", weight, make, price); 
  }
}
