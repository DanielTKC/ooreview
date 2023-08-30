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
    if (super.checkOut()) {
        adjustDueDate(-7); 
        return true;
    }
    return false;
}
  
  
  
}