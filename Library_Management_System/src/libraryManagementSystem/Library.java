package libraryManagementSystem;
import java.util.*;
public class Library {
	
	    ArrayList<Book> books=new ArrayList<Book>();

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void removeBook(String ISBN) {
	        for (Book book : books) {
	            if (book.ISBN.equals(ISBN)) {
	                books.remove(book);
	                break;
	            }
	        }
	    }

	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println("Title: " + book.title);
	            System.out.println("Author: " + book.author);
	            System.out.println("ISBN: " + book.ISBN);
	            System.out.println("Availability: " + book.availability);
	            System.out.println();
	        }
	    }
	}



