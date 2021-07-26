package soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();


    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String artist, List<Track> tracks) {
        super(title);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String artist, List<Track> tracks) {
        super(title, category);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category) {
        super(title, category);
    }
    public void addTrack(Track track) {
        String title = track.getTitle();
        int i = 1;
        for (Track track1 : tracks) {
            String titleTrack1 = track1.getTitle();
            if (titleTrack1.equals(title)) {
                System.out.println("Existed in DB");
                return;
            }
        }
        tracks.add(track);
        System.out.println("Added to tracks");
    }
    public void removeTrack() {
        Scanner inputTitle = new Scanner(System.in);
        System.out.println("Delete Application: ");
        System.out.println("--------------------------------");

        System.out.println("Enter the title to delete");
        String titleWantToDelete = inputTitle.nextLine();
        for (Track track : tracks) {
            String trackTitle = track.getTitle();
            if (trackTitle.equals(titleWantToDelete)) {
                System.out.print("Existed. Information:\n");
                System.out.printf("%-20s %-20s\n", "Title", "Length");
                System.out.printf("%-20s %-20s\n", track.getTitle(), track.getLength());
                tracks.remove(track);
                System.out.println("Deleted track");
//
            }
        }
    }
    public int getLength() {
        int lengthCD = 0;
        for (Track track : tracks) {
            int lengthOfTrack = track.getLength();
            lengthCD += lengthOfTrack;
        }
        return lengthCD;
    }
    public int getTotalTrack(){
        return this.tracks.size();
    }
    @Override
    public void play() {
        for (Track track:tracks) {
            System.out.printf("%-20s %-20s\n", "Title", "Length");
            System.out.printf("%-20s %-20s\n", track.getTitle(), track.getLength());
        }
    }
    @Override
    public int compareTo(Media o) {
        CompactDisc CD  = (CompactDisc) o;
        int currentSumOfTracks = this.getTotalTrack();
        int compareSumOfTrack = CD.getTotalTrack();
        int currentLength = this.getLength();
        int compareLength = CD.getLength();
        if (currentSumOfTracks > compareSumOfTrack) {
            return 1;
        } else if (currentSumOfTracks < compareSumOfTrack) {
            return -1;
        }else {

            if (currentLength > compareLength) {
                return 1;
            } else if (currentLength < compareLength) {
                return -1;
            }
        }
        return this.getTitle().compareTo(CD.getTitle());
    }
}
