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
    if (weeks < 1 || weeks > 4) {
        System.out.println("Ebooks can be checked out for a period of 1-4 weeks only.");
        return false;
    }

    if (super.checkOut()) {
        adjustDueDate(weeks * 7 - 21); // subtracting the 3 weeks set by the original checkOut
        return true;
    }
    return false;
}
  
}