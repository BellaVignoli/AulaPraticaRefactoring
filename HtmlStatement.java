import java.util.Enumeration;
public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = result(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += result1(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
      }
      //add footer lines
      result +=
      result2(String.valueOf(aCustomer.getTotalCharge()));
    
      result += result3(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
  }
  private String result(String Name){
    return "<H1>Rentals for <EM>" + Name + "</EM></H1><P>\n";
  }
  private String result1(String Movie, String Charge){
    return Movie + ": " + Charge + "<BR>\n";
  }
  private String result2(String TotalCharge){
    return "<P>You owe <EM>" + TotalCharge + "</EM><P>\n";
  }
  private String result3(String TotalFrequent){
    return "On this rental you earned <EM>" + TotalFrequent + "</EM> frequent renter points<P>";
  }
}