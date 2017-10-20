import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Account {
  
  private String myName;
  private int myID;
  private double myBalance;
  private double myAnnualInterestRate;
  private String myDateCreated;
  private ArrayList<Transaction> myTransactions;
  SimpleDateFormat sdf;
  
  public Account() { 
    this("None", 0, 0, 0);
  }
  
  public Account(String name, int ID, double balance, double annualInterestRate){
   myName = name;
   myID = ID;

   myAnnualInterestRate = annualInterestRate;
   sdf = new SimpleDateFormat("MM-dd-yyyy");
   myDateCreated = sdf.format(new Date());
   myTransactions = new ArrayList<Transaction>();
   
   if (balance > 0)deposit(balance);
   else if (balance < 0) withdraw(balance);
  }
  
  public String getName(){return myName;}
  public void setName(String name){myName = name;}
  
  public int getID(){return myID;}
  public void setID(int ID){myID = ID;}
  
  public double getBalance(){return myBalance;}
  public void setBalance(double balance){myBalance = balance;}
  
  public double getAnnualInterestRate(){return myAnnualInterestRate;}
  public void setAnnualInterestRate(double annualInterestRate){myAnnualInterestRate = annualInterestRate;}
  
  public String getDateCreated(){return myDateCreated;}
  
  public double getMonthlyInterestRate(){return myAnnualInterestRate/12.0;}
  
  public double getMonthlyInterest(){
    try{
      Date dateCreated = sdf.parse(myDateCreated);
      Date date = new Date();
      
      Calendar one = new GregorianCalendar();
      one.setTime(dateCreated);
      Calendar two = new GregorianCalendar();
      two.setTime(date);

      int monthDiff = two.get(Calendar.YEAR) - one.get(Calendar.YEAR) * 12 + two.get(Calendar.MONTH) - one.get(Calendar.MONTH);
     
      return myBalance * Math.pow((1 + getMonthlyInterestRate()), monthDiff);
    } catch (Exception e){}
    return 0;
  }
  
  public void withdraw(double amount){
    addTransaction('W', amount, sdf.format(new Date()));
  }
  public void deposit(double amount){
    addTransaction('D', amount, sdf.format(new Date()));
  }
  
  public void addTransaction(char type, double amount, String date){
    if (type == 'D') myBalance += amount;
    else if (type == 'W') myBalance -= amount;
    myTransactions.add(new Transaction(type,amount,date));
  }
  
  public String toString(){
    String s = String.format("Name : %s\nID : %d\nCurrent balance : $%.2f\nAnnual interest rate : %.3f\nDate created : %s\nTransactions:\n", myName, myID, myBalance, myAnnualInterestRate, myDateCreated);
    s += "Date           Type        Amount      New Balance\n";
    for (Transaction i : myTransactions){s += String.format("%s        %c    %10.2f       %10.2f\n", i.getDate(), i.getType(), i.getAmount(), i.getNewBalance());}
    return s;
  }
}
