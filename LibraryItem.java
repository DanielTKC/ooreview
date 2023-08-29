package com.ooreview;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class LibraryItem {

  private String title;
  private String callNumber;
  private String format;
  private boolean available;
  private Calendar dueDate;

  public LibraryItem(String title, String callNumber, String format) {

    this.title = title;
    this.callNumber = callNumber;
    this.format = format;
    this.available = true;
    this.dueDate = null;

  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the callNumber
   */
  public String getCallNumber() {
    return callNumber;
  }

  /**
   * @param callNumber the callNumber to set
   */
  protected void setCallNumber(String callNumber) {
    // validate the callNumber
    this.callNumber = callNumber;
  }


  /**
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * @param format the format to set
   */
  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * @return the available
   */
  public boolean isAvailable() {
    return available;
  }

  /**
   * @param available the available to set
   */
  private void setAvailable(boolean available) {
    this.available = available;
  }

  /**
   * @return the dueDate
   */
  public String getDueDate() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
    
    if (dueDate == null) {
      return "No due date set";
  }

    return dateFormat.format(dueDate.getTime());
  }

  /**
   * Sets the due date.
   */
  private void setDueDate() {
    dueDate = Calendar.getInstance();
    dueDate.add(Calendar.DATE, 21);
  }
  
// /**
//  * Overload setDueDate
//  */
//  
//  protected void setDueDate(int weeks) {
//    dueDate = Calendar.getInstance();
//    dueDate.add(Calendar.DATE, weeks * 7);
//  }

  @Override
  public String toString() {
    String retString = "";

    retString += "Title: " + getTitle();
    retString += ", callNumber: " + getCallNumber();

    return retString;
  }

  public boolean checkOut() {
    // set a dueDate for the item to be 3 weeks from checkout date
    // mark item as not available

    if (isAvailable()) {
      setAvailable(false);
      setDueDate();
      return true;
    } else {
      System.out.println("The item is unavailable and cannot be checked out");
      return false;
    }
  }

  public boolean returnItem() {
    // mark item as available
    // set dueDate to null

    if (!isAvailable()) {
      setAvailable(true);
      dueDate = null;
      return true;
    } else {
      System.out.println("The item is already available");
      return false;
    }
  }


}
