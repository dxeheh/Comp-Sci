public class TestTransaction {
  public static void main(String[] args) { 
    Transaction t = new Transaction("D".charAt(0), 1200, "12-21-2000");
    Transaction t2 = new Transaction("W".charAt(0), 100, "12-22-2000");
    System.out.println(t2.getNewBalance());
  }
}
