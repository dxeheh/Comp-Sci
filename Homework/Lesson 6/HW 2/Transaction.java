public class Transaction {
  
  private char myType;
  private double myAmount,myNewBalance;
  private static double myOverallBalance;
  private String myDate;
  
  public Transaction(char type, double amount, String date) {
    myType = type;
    myAmount = amount;
    myDate = date;
    if (type == "D".charAt(0)) myOverallBalance += amount;
    else if (type == "W".charAt(0)) myOverallBalance -= amount;
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
