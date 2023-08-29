/**
 * 
 */
package com.ooreview;

/**
 * @author Daniel Terreros
 *
 */
public class LibraryItemTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Use methods for your tests
		// and call the test methods from main

		testBook();
		testEBook(); 
		testVideo();
		testStreamingVideo();
		//testPolymorphism();
	}

	public static void originalLibraryItemTest() {
		
		System.out.println("*** Initial test invalid, here for reference only *** ");
		/*
		 * 
		This worked before creating a new constructor with parameters 
		LibraryItem item1 = new LibraryItem();
		 */

		/*
		System.out.println("***Test the Library Item***\n");
		LibraryItem item1 = new LibraryItem("Hop on Pop", "BK001", "Book");
		System.out.println("item1 toString: " + item1);


		System.out.println("Title: " + item1.getTitle());

		item1.setTitle("Green Eggs and Ham");
		System.out.println("TEST: Change title to green eggs and ham");
		System.out.println("Title after test: " + item1.getTitle());
		 */
		System.out.println("*** End - Initial test *** ");

	}

	public static void testBook() {

		// Test the Book class
		System.out.println("\n***Test Book class***");
		Book book1 = new Book("Hop on Pop", "BK002", "Dr. Seuss", "Randall House");
		System.out.println("book1 title: " + book1.getTitle() + " , author: " + book1.getAuthor());
		System.out.println("book1 toString: " + book1);
		System.out.println("Book1 available [true]: " + book1.isAvailable());
		System.out.println("Check out book1");
		book1.checkOut();
		System.out.println("Book1 available [false]: " + book1.isAvailable());
		System.out.println("Book1 due date: " + book1.getDueDate());
		System.out.println("Checkout book1 - invalid");
		book1.checkOut();
		System.out.println("***End Test Book class***");


	}
	
	 public static void testEBook() {

	    // Test the eBook class
	    try {
	    System.out.println("\n***Test eBook class***");
	    EBook ebook1 = new EBook("Hop on Pop", "BK002", "Dr. Seuss", "Randall House", "PDF");
	    System.out.println("ebook1 title: " + ebook1.getTitle() + " , author: " + ebook1.getAuthor());
	    System.out.println("Author Change");
	    ebook1.setAuthor("Michael Meyers");
	    System.out.println("New Author: " + ebook1.getAuthor());
	    System.out.println("ebook1 toString: " + ebook1);
	    System.out.println("eBook1 available [true]: " + ebook1.isAvailable());
	    System.out.println("Check out ebook1");
	    ebook1.checkOut(4);
	    System.out.println("eBook1 available [false]: " + ebook1.isAvailable());
	    System.out.println("eBook1 due date: " + ebook1.getDueDate());
	    System.out.println("Checkout ebook1 - invalid");
	    ebook1.checkOut();
	    System.out.println("Return The eBook");
	    ebook1.returnItem();
	    System.out.println("eBook1 available [true]: " + ebook1.isAvailable());
	    System.out.println("***End Test eBook class***");
	    } catch (Exception e) {
        System.out.println("An exception occurred: " + e.getMessage());
        e.printStackTrace();
	    }
	  }
	 
	 public static void testVideo() {
	   System.out.println("\n***Test video class***");
	   Video video = new Video("Hop on Pop", "vid001", "Mike Meyers", "HBO" );
	   System.out.println("Video title: " + video.getTitle() + ", callNumber " + video.getCallNumber());
	   System.out.println("Video toString " + video);
	   video.setStudio("WB");
	   System.out.println("New Studio: " + video.getStudio());
	   System.out.println("Video availible [true]: " + video.isAvailable());
	   System.out.println("Check out video");
	   video.checkOut();
	   System.out.println("video available [false]: " + video.isAvailable());
	   System.out.println("Video due date: " + video.getDueDate());
	   System.out.println("video checkout - invalid");
	   video.checkOut();
	   
	 }
	 
	 public static void testStreamingVideo() {
     System.out.println("\n***Test streaming video class***");
     StreamingVideo streamingVideo = new StreamingVideo("Hop on Pop", "vid001", "Mike Meyers", "HBO" );
     System.out.println("Video title: " + streamingVideo.getTitle() + ", callNumber " + streamingVideo.getCallNumber());
     System.out.println("Video toString " + streamingVideo);
     streamingVideo.setProducer("Big Cat Productions");
     System.out.println("New Producer: " + streamingVideo.getProducer());
     
     System.out.println("Video availible [true]: " + streamingVideo.isAvailable());
     System.out.println("Check out video");
     streamingVideo.checkOut();
     System.out.println("video available [false]: " + streamingVideo.isAvailable());
     System.out.println("Video due date: " + streamingVideo.getDueDate());
     System.out.println("video checkout - invalid");
     streamingVideo.checkOut();
     streamingVideo.returnItem();
     System.out.println("Just returned the video, is it available now? " + streamingVideo.isAvailable());
	   
	 }

	public static void testPolymorphism() {
		// Polymorphism example
		System.out.println("\n*** Polymorphism test");
		Book book1 = new Book("Hop on Pop", "BK002", "Dr. Seuss", "Randall House");
		LibraryItem item1 = new Book("Hop on Pop", "BK001", "Dr. Seuss", "Randall House");
		System.out.println(item1);
		System.out.println("\n*** End Polymorphism test");

	}
}


