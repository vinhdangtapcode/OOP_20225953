package hust.soict.dsai.aims.media;

public class Disc extends Media implements Playable{
	int length;
	String director;
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
	
	public Disc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.length = length;
        this.director = director;
    }
	
	 public void play() {
	        System.out.println("Playing media: " + getTitle());
	    }
}
