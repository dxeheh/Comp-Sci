import java.util.Date;
import java.text.SimpleDateFormat;
public class Transaction {
  private char myType;
  private double myAmount;
  private static double myNewBalance;
  private String myDate;
  
  public Transaction(char type, double amount,  Date date) {
    myType = type;
    myAmount = amount;
    myNewBalance = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    String myDate = sdf.format(date);
  }
  
  public String getDate(){return myDate;}
  public void setDate(String date){myDate = date;}
  
  public char getType(){return myType;}
  public void setType(char type){myType = type;}
  
  public double getAmount(){return myAmount;}
  public void setAmount(double amount){myAmount = amount;}
}
