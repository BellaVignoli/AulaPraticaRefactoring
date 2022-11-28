public class TextStatement extends Statement {
  public String result(String Name){
    return "Rental Record for " + Name +
      "\n";
  }
  public String result1(String Movie, String Charge){
    return "\t" + Movie + "\t" +
         Charge + "\n";
  }
  public String result2(String TotalCharge){
    return "Amount owed is " +
      TotalCharge + "\n";
  }
  public String result3(String TotalFrequent){
    return "You earned " +
      TotalFrequent + " frequent renter points";
  }
}