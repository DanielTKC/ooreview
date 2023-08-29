package com.ooreview;

public class Video extends LibraryItem {
  
  private String producer;
  private String studio;
  
  public Video(String title, String callNumber, String producer, String studio) {
    super(title, callNumber, "Video");
    
    this.producer = producer;
    this.studio = studio;
  }

  /**
   * @return the producer
   */
  public String getProducer() {
    return producer;
  }

  /**
   * @param producer the producer to set
   */
  public void setProducer(String producer) {
    this.producer = producer;
  }

  /**
   * @return the studio
   */
  public String getStudio() {
    return studio;
  }

  /**
   * @param studio the studio to set
   */
  public void setStudio(String studio) {
    this.studio = studio;
  }
  
  @Override
  public String toString() {
    
    //System.out.println("This is the Book toString method");
    String retString = super.toString();
    retString += ", producer: " + getProducer() + ", studio: " + getStudio();
    
    return retString;
  }
  
  @Override
  public boolean checkOut() {
      if (isAvailable()) {
          setAvailable(false);
          setDueDate(1);  // set due date to 1 week
          return true;
      } else {
          System.out.println("The video is unavailable and cannot be checked out");
          return false;
      }
  }
  
  
  
}