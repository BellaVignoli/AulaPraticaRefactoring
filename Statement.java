import java.util.Enumeration;
abstract class Statement {
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
  abstract String result(String Name);
  abstract String result1(String Movie, String Charge);
  abstract String result2(String TotalCharge);
  abstract String result3(String TotalFrequent);
}