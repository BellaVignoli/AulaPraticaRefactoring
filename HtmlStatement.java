public class HtmlStatement extends Statement {
  public String result(String Name){
    return "<H1>Rentals for <EM>" + Name + "</EM></H1><P>\n";
  }
  public String result1(String Movie, String Charge){
    return Movie + ": " + Charge + "<BR>\n";
  }
  public String result2(String TotalCharge){
    return "<P>You owe <EM>" + TotalCharge + "</EM><P>\n";
  }
  public String result3(String TotalFrequent){
    return "On this rental you earned <EM>" + TotalFrequent + "</EM> frequent renter points<P>";
  }
}