public class Transaction {
  
  private char myType;
  private double myAmount,myNewBalance;
  private static double myOverallBalance;
  private String myDate;
  
  public Transaction(char type, double amount, String date) {
    myType = Character.toUpperCase(type);
    myAmount = amount;
    myDate = date;
    if (myType == 'D') myOverallBalance += amount;
    else if (myType == 'W') myOverallBalance -= amount;
    myNewBalance = myOverallBalance;
  }
  
  public String getDate(){return myDate;}
  public void setDate(String date){myDate = date;}
  
  public char getType(){return myType;}
  public void setType(char type){myType = type;}
  
  public double getAmount(){return myAmount;}
  public void setAmount(double amount){myAmount = amount;}
  
  public double getNewBalance(){return myNewBalance;}
}
