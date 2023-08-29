package com.ooreview;


public class EBook extends Book {
  
  
  
  public EBook(String title, String callNumber, String author, String publisher, String format) {
    super(title, callNumber, author, publisher);
    super.setFormat(format);
    
  }


  
  @Override
  public String toString() {
    String retString = super.toString();
    retString += " , format:  " + getFormat();
    
    return retString;
    
  }
  
  public boolean checkOut(int weeks) {
    // set a dueDate for the item to be 1-4 weeks from checkout date
    // mark item as not available
    
    if (weeks < 1 || weeks > 4) {
      System.out.println("Ebooks can be checked out for a period of 1-4 weeks only.");
      return false;
  }

    if (isAvailable()) {
      setAvailable(false);
      setDueDate(weeks);
      return true;
    } else {
      System.out.println("The item is unavailable and cannot be checked out");
      return false;
    }
  }
  
}