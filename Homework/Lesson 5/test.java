public String getHexaString(){
    int quotient = value;
    int remainder;
    String hex = "";
    String formatted;
    String [] array = {"a", "b", "c", "d", "e", "f"};
    int x;
    
    do{
      remainder = quotient % 16;
      quotient = qoutient / 16;
      
      if(remainder < 10)formatted = String.format("%d", remainder);
      else formatted = array[remainder-10];
      hex = formatted + hex;
    }while(quotient != 0);
    return hex;
  }
