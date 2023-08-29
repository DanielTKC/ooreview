package com.ooreview;

public class Book extends LibraryItem {
  
  private String author;
  private String publisher;

  public Book(String title, String callNumber, String author, String publisher) {
    super(title, callNumber, "Book");
    
    this.author = author;
    this.publisher = publisher; 
  }

  /**
   * @return the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * @return the publisher
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * @param publisher the publisher to set
   */
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  @Override
  public String toString() {
    
    //System.out.println("This is the Book toString method");
    String retString = super.toString();
    retString += ", author: " + getAuthor();
    
    return retString;
  }
}
