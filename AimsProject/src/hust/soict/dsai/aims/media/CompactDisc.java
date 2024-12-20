package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;            
    private ArrayList<Track> tracks; 
   
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost); 
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }
    
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
   
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" added.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track \"" + track.getTitle() + "\" removed.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" not found in the list.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();  
        }
        return totalLength;
    }

    public String toString() {
        return "CD - " + title + " - " + category + " - " + director + " - " + 
               artist + " - " + getLength() + " minutes: " + cost + " $";
    }
    
    public void play() {
        System.out.println("Playing Compact Disc: " + this.getTitle() + " by " + artist);
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
}
