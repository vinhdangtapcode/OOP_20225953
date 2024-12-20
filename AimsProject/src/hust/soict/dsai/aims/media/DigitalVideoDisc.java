package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost); 
        synchronized (DigitalVideoDisc.class) {
        }
    }
    
    public DigitalVideoDisc(String title) {
        super(title, "Unknown", "Unknown", 0, 0); 
        synchronized (DigitalVideoDisc.class) {
        }
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, "Unknown", 0, cost);
        synchronized (DigitalVideoDisc.class) {
        }
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title); 
    }
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + 
               length + " minutes: " + cost + " $";
    }
    
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
