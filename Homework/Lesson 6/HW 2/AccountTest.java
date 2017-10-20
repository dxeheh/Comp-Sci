public class AccountTest {
  public static void main(String[] args) { 
    Account a = new Account("Ryan", 884897, 100, 0.015);
    a.deposit(100);
    a.withdraw(90);
    System.out.println(a);
  }
}
