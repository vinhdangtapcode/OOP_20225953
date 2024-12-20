package hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;


public class Book extends Media{
	private List<String> authors= new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
	
	public Book(String title, String category,float cost) {
        super(title, category, cost);  
        this.authors = new ArrayList<>();
    }
	
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            System.out.println("Author name cannot be empty.");
        }
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author: " + authorName + " already exists.");
        }
    }
	
	public void removeAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            System.out.println("Author name cannot be empty.");
        }
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
	
	public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
	
    public String toString() {
        return "Book - " + title + " - " + category + " - " + " - " + cost + " $";
    }
}
