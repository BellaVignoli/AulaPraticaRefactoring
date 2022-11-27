import java.util.Enumeration;
public class TextStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = result(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += result1(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
      }
      //add footer lines
      result += result2(String.valueOf(aCustomer.getTotalCharge()));
     
      result +=
      result3(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
   }
  private String result(String Name){
    return "Rental Record for " + Name +
      "\n";
  }
  private String result1(String Movie, String Charge){
    return "\t" + Movie + "\t" +
         Charge + "\n";
  }
  private String result2(String TotalCharge){
    return "Amount owed is " +
      TotalCharge + "\n";
  }
  private String result3(String TotalFrequent){
    return "You earned " +
      TotalFrequent + " frequent renter points";
  }
}