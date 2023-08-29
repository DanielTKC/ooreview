package com.ooreview;

public class StreamingVideo extends Video {

  public StreamingVideo(String title, String callNumber, String producer, String studio) {
    super(title, callNumber, producer, studio);
    super.setFormat("Mp4");
  }
  
  @Override
  public String toString() {
    String retString = super.toString();
    retString += " , format:  " + getFormat();
    
    return retString;
    
  }
  
  @Override
  public boolean checkOut() {
      if (isAvailable()) {
          setAvailable(false);
          setDueDate(2);  // set due date to 2 week
          return true;
      } else {
          System.out.println("The video is unavailable and cannot be checked out");
          return false;
      }
  }
  
  
  
}