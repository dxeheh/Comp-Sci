public class TestTransaction {
  public static void main(String[] args) { 
    Transaction t = new Transaction('D', 1200, "12-21-2000");
    Transaction t2 = new Transaction('W', 100, "12-22-2000");
    System.out.println(t2.getNewBalance());
  }
}
