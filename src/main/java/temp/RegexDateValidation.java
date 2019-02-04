package temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDateValidation {

  public boolean checkDateFrmat(String date) {
    if (date.matches("(1[0-2]|[1-9])/(3[01]|[12][0-9]|[1-9])/[0-9]{4}")) {
      return true;
    }
    return false;
  }

//  public boolean checkDate2(String date) {
//    String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
//    Pattern pattern = Pattern.compile(regex);
//    Matcher matcher = pattern.matcher(date);
//  }

  public boolean checkDate2(String date) {
    String regex = "(1[0-2]|[1-9])/(3[01]|[12][0-9]|[1-9])/[0-9]{4}";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(date);
    if (matcher.matches()){
      return true;
    }
    return false;
  }
}
