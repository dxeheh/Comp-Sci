public class BHSInteger {
  int value;
  public BHSInteger(int x){value = x;}
  public int getInteger(){return new Integer(value);}
  public String toString(){return ""+getInteger();}
  public String getHexString(){
    if(value<1)return "0";
    String h = "0123456789ABCDEF";
    String r = "";
    int x = getInteger();
    while(x>0){
     int d = x % 16;
     r = h.charAt(d) + r;
     x /= 16;
    }
    return r;
  }
  public boolean isEven(){return isEven(getInteger());}
  public boolean isOdd(){return isOdd(getInteger());}
  public boolean isPrime(){return isPrime(getInteger());}
  public static boolean isEven(int x){
    if(x%2 == 0)return true;
    return false;
  }
  public static boolean isOdd(int x){
    if(isEven(x))return false;
    return true;
  }
  public static boolean isPrime(int x){
    if(isEven(x))return false;
    for(int i=3;i*i<=x;i+=2) {
        if(x%i == 0)return false;
    }
    return true;
  }
}
